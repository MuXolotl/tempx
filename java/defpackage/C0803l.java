package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lۣؒؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public class C0803l extends IOException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f2425l;

    public static C0803l amazon() {
        return new C0803l("CodedInputStream encountered a malformed varint.");
    }

    public static C0803l billing() {
        return new C0803l("Failed to parse the message.");
    }

    public static C8352l crashlytics() {
        return new C8352l("Protocol message tag had invalid wire type.");
    }

    public static C0803l loadAd() {
        return new C0803l("Protocol message had invalid UTF-8.");
    }

    public static C0803l mopub() {
        return new C0803l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static C0803l purchase() {
        return new C0803l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0803l yandex() {
        return new C0803l("Protocol message contained an invalid tag (zero).");
    }
}
