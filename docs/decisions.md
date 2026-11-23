# Decisions

A record of the important choices made in FlowTrack and why.

---

## 001: Build FlowTrack as a web app

**Date:** 2026-11-23

**Decision:** FlowTrack will be a web app with a Java Spring Boot backend.

**Options considered:**
- Web app (Spring Boot + web front end)
- Android app (Java)
- Desktop app (JavaFX)

**Why a web app:**
- **Reach:** works on any phone or computer with a browser, with nothing to install. This includes iPhones and cheaper phones.
- **Easy to try:** anyone can test it from a link, including lecturers and recruiters.
- **Location:** browsers can detect the user's location, which the planned area feature needs.
- **Java skills:** Spring Boot uses Java, which I already know.
- **Room to grow:** the same backend can later serve an Android app.

**Why not the others:**
- **Android:** leaves out iPhone users, and people must install an APK to try it.
- **Desktop (JavaFX):** people report water problems from their phones, not from a PC.
