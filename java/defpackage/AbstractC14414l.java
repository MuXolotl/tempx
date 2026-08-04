package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: lٓۛؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC14414l {
    public static final C17963l yandex;

    static {
        C17963l c17963l = new C17963l();
        C2336l c2336l = AbstractC18202l.yandex;
        c17963l.put(c2336l.loadAd(String.class), C0194l.yandex);
        c17963l.put(c2336l.loadAd(Character.TYPE), C18279l.yandex);
        c17963l.put(c2336l.loadAd(char[].class), C3395l.crashlytics);
        c17963l.put(c2336l.loadAd(Double.TYPE), C7872l.yandex);
        c17963l.put(c2336l.loadAd(double[].class), C3837l.crashlytics);
        c17963l.put(c2336l.loadAd(Float.TYPE), C0654l.yandex);
        c17963l.put(c2336l.loadAd(float[].class), C15459l.crashlytics);
        c17963l.put(c2336l.loadAd(Long.TYPE), C2010l.yandex);
        c17963l.put(c2336l.loadAd(long[].class), C16629l.crashlytics);
        c17963l.put(c2336l.loadAd(C10882l.class), C15256l.yandex);
        c17963l.put(c2336l.loadAd(Integer.TYPE), C1313l.yandex);
        c17963l.put(c2336l.loadAd(int[].class), C16564l.crashlytics);
        c17963l.put(c2336l.loadAd(C12524l.class), C12975l.yandex);
        c17963l.put(c2336l.loadAd(Short.TYPE), C18169l.yandex);
        c17963l.put(c2336l.loadAd(short[].class), C4747l.crashlytics);
        c17963l.put(c2336l.loadAd(C15717l.class), C15023l.yandex);
        c17963l.put(c2336l.loadAd(Byte.TYPE), C4162l.yandex);
        c17963l.put(c2336l.loadAd(byte[].class), C7235l.crashlytics);
        c17963l.put(c2336l.loadAd(C15962l.class), C5915l.yandex);
        c17963l.put(c2336l.loadAd(Boolean.TYPE), C2796l.yandex);
        c17963l.put(c2336l.loadAd(boolean[].class), C11642l.crashlytics);
        InterfaceC1388l interfaceC1388lLoadAd = c2336l.loadAd(Unit.class);
        Unit unit = Unit.INSTANCE;
        c17963l.put(interfaceC1388lLoadAd, C3750l.loadAd);
        c17963l.put(c2336l.loadAd(Void.class), C13175l.yandex);
        try {
            InterfaceC1388l interfaceC1388lLoadAd2 = c2336l.loadAd(C9658l.class);
            C6760l c6760l = C9658l.f19699l;
            c17963l.put(interfaceC1388lLoadAd2, C1880l.yandex);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            c17963l.put(AbstractC18202l.yandex.loadAd(C12339l.class), C5757l.crashlytics);
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            c17963l.put(AbstractC18202l.yandex.loadAd(C4055l.class), C8388l.crashlytics);
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            c17963l.put(AbstractC18202l.yandex.loadAd(C15868l.class), C17997l.crashlytics);
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            c17963l.put(AbstractC18202l.yandex.loadAd(C2189l.class), C6177l.crashlytics);
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            c17963l.put(AbstractC18202l.yandex.loadAd(C17201l.class), C3037l.yandex);
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        try {
            InterfaceC1388l interfaceC1388lLoadAd3 = AbstractC18202l.yandex.loadAd(C2106l.class);
            C2106l c2106l = C2106l.f4733l;
            c17963l.put(interfaceC1388lLoadAd3, C8458l.yandex);
        } catch (ClassNotFoundException | NoClassDefFoundError unused7) {
        }
        yandex = c17963l.crashlytics();
    }
}
