package defpackage;

import java.io.IOException;

/* JADX INFO: renamed from: lؓۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C2297l extends IOException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public boolean f4988l;

    public static C2297l amazon() {
        return new C2297l("CodedInputStream encountered a malformed varint.");
    }

    public static C2297l billing() {
        return new C2297l("Failed to parse the message.");
    }

    public static C8236l crashlytics() {
        return new C8236l("Protocol message tag had invalid wire type.");
    }

    public static C2297l loadAd() {
        return new C2297l("Protocol message had invalid UTF-8.");
    }

    public static C2297l mopub() {
        return new C2297l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static C2297l purchase() {
        return new C2297l("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C2297l yandex() {
        return new C2297l("Protocol message contained an invalid tag (zero).");
    }
}
