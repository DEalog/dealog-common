## 1.0.0 (under development)
This is the initial version setting up the base system

- `FIX` Change group listings to type String
- `NEW` Add an unsupported converter exception
- `NEW` Add scm information; add property to skip javadoc generation
- `CNG` Move enums to cap version 1.2
- `CNG` Change name of CAP implementation to alert, add cap version to package name
- `NEW` Add model of Common Alerting Protocol Version 1.2
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
