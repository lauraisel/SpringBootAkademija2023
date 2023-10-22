package hr.kingict.springbootakademija2023.mapper;

import com.amadeus.resources.FlightOfferSearch;
import hr.kingict.springbootakademija2023.dto.FlightSearchDto;
import org.springframework.stereotype.Component;

@Component
public class FlightOfferSearchFlightSearchDtoMapper {


    public FlightSearchDto map(FlightOfferSearch flightOfferSearch){
        if(flightOfferSearch == null){
            return null;
        }

        FlightSearchDto flightSearchDto = new FlightSearchDto();

        //itinerary

        FlightOfferSearch.Itinerary outboundItinerary = flightOfferSearch.getItineraries()[0];
        FlightOfferSearch.Itinerary inboundItinerary = flightOfferSearch.getItineraries()[1];

        //search Segments
        FlightOfferSearch.AirportInfo outboundDepartureSegment = outboundItinerary.getSegments()[0].getDeparture();
        FlightOfferSearch.AirportInfo outboundArrivalSegment = outboundItinerary.getSegments()[0].getArrival();

        FlightOfferSearch.AirportInfo inboundDepartureSegment =inboundItinerary.getSegments()[0].getDeparture();
        FlightOfferSearch.AirportInfo inboundArrivalSegment =inboundItinerary.getSegments()[0].getArrival();


        //outbound data
        flightSearchDto.setOutboundDepartureAirport(outboundDepartureSegment.getIataCode());
        flightSearchDto.setOutboundDepartureDate(outboundDepartureSegment.getAt());

        flightSearchDto.setOutboundArrivalAirport(outboundArrivalSegment.getIataCode());
        flightSearchDto.setOutboundArrivalDate(outboundArrivalSegment.getAt());

        flightSearchDto.setOutboundCarrier(outboundItinerary.getSegments()[0].getCarrierCode());

        //inbound data

        flightSearchDto.setInboundDepartureAirport(inboundDepartureSegment.getIataCode());
        flightSearchDto.setInboundDepartureDate(inboundDepartureSegment.getAt());

        flightSearchDto.setInboundArrivalAirport(inboundArrivalSegment.getIataCode());
        flightSearchDto.setInboundArrivalDate(inboundArrivalSegment.getAt());

        flightSearchDto.setInboundCarrier(inboundItinerary.getSegments()[0].getCarrierCode());


        //price
        flightSearchDto.setPrice(flightOfferSearch.getPrice().getTotal());


        return flightSearchDto;
    }
}
