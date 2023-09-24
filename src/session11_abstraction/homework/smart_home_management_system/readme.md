Smart Home Management System

Description:
With the rise of the Internet of Things (IoT) and smart devices, homes are becoming increasingly automated. In this
system, you are tasked with simulating the working of a Smart Home which integrates various devices, automations, user
profiles, and external integrations like weather forecasting.

Functional Requirements

User Profiles:

- Multiple users can be registered to a home: homeowner, family members, and guests.
- Each user profile has varying control levels: homeowners have full control, family members have partial control (can't
  add or remove devices), and guests have limited control (can only control devices in common areas).
- Users should be able to remotely control devices linked to their profile.

Device Management:

- Various types of devices can be added to the home: lights, thermostats, doors, windows, cameras, entertainment
  systems,
  etc.
- Each device type can have unique functionalities: lights can dim, thermostats set temperatures, doors can lock/unlock,
  cameras can record or take snapshots, etc.
- Devices can be assigned to specific rooms or areas

Automations & Scenes:

- Users can create "scenes" which are predefined settings for multiple devices: e.g., "Night Mode" might dim the lights,
  lock all doors, and set the thermostat to a particular temperature.
- Automations can be created based on triggers: e.g., if the outside temperature drops below a certain level, the
  heating
  should turn on.

External Integrations:

- Integrate with a weather service to fetch local weather conditions. This should influence automations: e.g., if it's
  about to rain, close all open windows.
- Integrate with a local news API to flash breaking news on the entertainment system.

Energy Management:

- Monitor the energy consumption of each device.
  Suggest energy-saving automations: e.g., if a room is empty and the lights are on for more than 10 minutes, turn them
  off.
- Generate monthly energy reports showing the consumption patterns and savings from the automations.

Security and Alerts:

- If a door or window is opened at odd hours, send an alert to the homeowner.
- Cameras should automatically start recording if an unrecognized face is detected.
- If smoke or fire detectors are triggered, alert all users and switch on all lights for safety.

Voice Commands:

- Simulate voice commands that users can give to control devices: e.g., "Turn off the living room lights" or "Set
  thermostat to 22 degrees".

Maintenance:

- Devices should have a "health" or "status" associated with them. If a device is malfunctioning or low on battery, an
  alert should be sent for maintenance.
- Schedule routine checks for devices.

