<?xml version="1.0"?>
<s:Envelope xmlns:s="http://schemas.xmlsoap.org/soap/envelope/">
  <s:Body>
    <npsLa01 xmlns="http://www.egem.nl/StUF/sector/bg/0310">
      <stuurgegevens>
        <berichtcode xmlns="http://www.egem.nl/StUF/StUF0301">La01</berichtcode>
        <zender xmlns="http://www.egem.nl/StUF/StUF0301">
          <applicatie>App</applicatie>
          <gebruiker>User</gebruiker>
        </zender>
        <ontvanger xmlns="http://www.egem.nl/StUF/StUF0301">
          <applicatie>OpenTunnel</applicatie>
          <administratie>TEST</administratie>
        </ontvanger>
        <referentienummer xmlns="http://www.egem.nl/StUF/StUF0301">1163740</referentienummer>
        <tijdstipBericht xmlns="http://www.egem.nl/StUF/StUF0301">2019122610200240</tijdstipBericht>
        <crossRefnummer xmlns="http://www.egem.nl/StUF/StUF0301">Lv01NPS0001</crossRefnummer>
        <entiteittype xmlns="http://www.egem.nl/StUF/StUF0301">NPS</entiteittype>
      </stuurgegevens>
      <parameters>
        <indicatorVervolgvraag xmlns="http://www.egem.nl/StUF/StUF0301">false</indicatorVervolgvraag>
        <aantalVoorkomens xmlns="http://www.egem.nl/StUF/StUF0301">1</aantalVoorkomens>
      </parameters>
      <antwoord>
        <object xmlns:a="http://www.egem.nl/StUF/StUF0301" a:entiteittype="NPS" a:sleutelVerzendend="312546">
          <inp.bsn>${bsn}</inp.bsn>
          <authentiek xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" a:noValue="nietOndersteund" a:metagegeven="true" xsi:nil="true"/>
          <geslachtsnaam>XXXXXXXXX</geslachtsnaam>
          <voorvoegselGeslachtsnaam xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" a:noValue="geenWaarde" xsi:nil="true"/>
          <voornamen>XXXXXXXXX</voornamen>
          <geslachtsaanduiding>M</geslachtsaanduiding>
          <geboortedatum>${geboortedatum}</geboortedatum>
          <inp.geboorteplaats>${geboorteplaats}</inp.geboorteplaats>
          <inp.geboorteLand>6030</inp.geboorteLand>
          <verblijfsadres>
            <wpl.woonplaatsNaam>Berkel en Rodenrijs</wpl.woonplaatsNaam>
            <gor.openbareRuimteNaam>Prins Bernhardlaan</gor.openbareRuimteNaam>
            <gor.straatnaam>Prins Bernhardlaan</gor.straatnaam>
            <aoa.postcode>${verblijfsadres.postcode}</aoa.postcode>
            <aoa.huisnummer>${verblijfsadres.huisnummer}</aoa.huisnummer>
            <aoa.huisletter>${verblijfsadres.huisletter}</aoa.huisletter>
            <#if verblijfsadres.huisnummertoenoeging ??>
             <aoa.huisnummertoevoeging>${verblijfsadres.huisnummertoenoeging}</aoa.huisnummertoevoeging>
            </#if>
          </verblijfsadres>
          <inp.gemeenteVanInschrijving>1621</inp.gemeenteVanInschrijving>
          <inp.datumInschrijving>YYYYMMDD</inp.datumInschrijving>
          <inp.heeftAlsOuders a:entiteittype="NPSNPSOUD">
            <gerelateerde a:entiteittype="NPS" a:sleutelVerzendend="312545">
              <inp.bsn>${ouder1.bsn}</inp.bsn>
              <authentiek xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" a:noValue="nietOndersteund" a:metagegeven="true" xsi:nil="true"/>
            </gerelateerde>
            <ouderAanduiding>Ouder1</ouderAanduiding>
          </inp.heeftAlsOuders>
          <inp.heeftAlsOuders a:entiteittype="NPSNPSOUD">
            <gerelateerde a:entiteittype="NPS" a:sleutelVerzendend="312545">
              <inp.bsn>${ouder2.bsn}</inp.bsn>
              <authentiek xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" a:noValue="nietOndersteund" a:metagegeven="true" xsi:nil="true"/>
            </gerelateerde>
            <ouderAanduiding>Ouder2</ouderAanduiding>
          </inp.heeftAlsOuders>
        </object>
      </antwoord>
    </npsLa01>
  </s:Body>
</s:Envelope>