## 1.0.0 (under development)
This is the initial version setting up the base system

- `NEW` Add organization and category field to message payload
- 'CNG' Raise quarkus version to 1.9.2
- `NEW` Add ars field to message payload
- 'CNG' Change to Java 11
- `NEW` Add message event type "Disposed"
- `CNG` Renamed message event type: Published -> Created
- `NEW` Add publishedAt field. Timestamp in UTC
- `NEW` Add geocode field. Expects a geometry polygon as WKT 
- `NEW` Basic message event and payload model
- `NEW` Add message event deserializer

## Legend

- `NEW` means a new feature
- `CNG` means changed behavior
- `FIX` means a bugfix or fix of a glitch
- `REM` means a removed feature
