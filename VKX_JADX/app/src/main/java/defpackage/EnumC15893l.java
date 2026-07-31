package defpackage;

import java.util.Set;

/* JADX INFO: renamed from: lَٕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC15893l {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3498l f31170l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3498l f31171l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final Set f31163l = AbstractC8669l.m2407import(new EnumC15893l[]{CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE});

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC1220l f31169l = AbstractC9968l.crashlytics(2, new C15731l(this, 0));

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC1220l f31172l = AbstractC9968l.crashlytics(2, new C15731l(this, 1));

    EnumC15893l(String str) {
        this.f31171l = C3498l.purchase(str);
        this.f31170l = C3498l.purchase(str.concat("Array"));
    }
}
