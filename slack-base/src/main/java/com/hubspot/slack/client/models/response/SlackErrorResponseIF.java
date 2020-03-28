package com.hubspot.slack.client.models.response;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.JsonNode;
import org.immutables.value.Value.Immutable;

import com.hubspot.immutables.style.HubSpotStyle;

import javax.annotation.Nullable;

@Immutable
@HubSpotStyle
public interface SlackErrorResponseIF extends SlackResponse {
  @Nullable  JsonNode getJson();
  Optional<SlackError> getError();
  List<SlackError> getErrors();
}
