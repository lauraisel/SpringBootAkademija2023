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
        FlightOfferSearch.SearchSegment outboundDepartureSegment = outboundItinerary.getSegments()[0];
        FlightOfferSearch.SearchSegment outboundArrivalSegment = outboundItinerary.getSegments()[1];

        FlightOfferSearch.SearchSegment inboundDepartureSegment = inboundItinerary.getSegments()[0];
        FlightOfferSearch.SearchSegment inboundArrivalSegment = inboundItinerary.getSegments()[1];


        //outbound data
        flightSearchDto.setOutboundDepartureAirport(outboundDepartureSegment.getDeparture().getIataCode());
        flightSearchDto.setOutboundDepartureDate(outboundDepartureSegment.getDeparture().getAt());

        flightSearchDto.setOutboundArrivalAirport(outboundArrivalSegment.getDeparture().getIataCode());
        flightSearchDto.setOutboundArrivalDate(outboundArrivalSegment.getDeparture().getAt());

        flightSearchDto.setOutboundCarrier(outboundDepartureSegment.getCarrierCode());

        //inbound data

        flightSearchDto.setInboundDepartureAirport(inboundDepartureSegment.getDeparture().getIataCode());
        flightSearchDto.setInboundDepartureDate(inboundDepartureSegment.getDeparture().getAt());

        flightSearchDto.setInboundArrivalAirport(inboundArrivalSegment.getDeparture().getIataCode());
        flightSearchDto.setInboundArrivalDate(inboundArrivalSegment.getDeparture().getAt());

        flightSearchDto.setInboundCarrier(inboundDepartureSegment.getCarrierCode());


        flightSearchDto.setPrice(flightOfferSearch.getPrice().getTotal());


        return flightSearchDto;
    }
}
