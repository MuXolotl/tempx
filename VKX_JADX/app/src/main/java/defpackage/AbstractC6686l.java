package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;

/* JADX INFO: renamed from: lؙۗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6686l extends AbstractC5006l {
    public final MeasurementManager mopub;

    public AbstractC6686l(MeasurementManager measurementManager) {
        this.mopub = measurementManager;
    }

    public static Object adcel(AbstractC6686l abstractC6686l, AbstractC6459l abstractC6459l, InterfaceC14029l interfaceC14029l) {
        new C2397l(1, AbstractC17082l.billing(interfaceC14029l)).license();
        MeasurementManager measurementManager = abstractC6686l.mopub;
        throw null;
    }

    public static Object firebase(AbstractC6686l abstractC6686l, InterfaceC14029l interfaceC14029l) {
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        abstractC6686l.mopub.getMeasurementApiStatus(new ExecutorC11374l(2), new C0910l(c2397l));
        return c2397l.Signature();
    }

    public static Object isPro(AbstractC6686l abstractC6686l, AbstractC1634l abstractC1634l, InterfaceC14029l interfaceC14029l) {
        new C2397l(1, AbstractC17082l.billing(interfaceC14029l)).license();
        MeasurementManager measurementManager = abstractC6686l.mopub;
        throw null;
    }

    public static Object metrica(AbstractC6686l abstractC6686l, Uri uri, InterfaceC14029l interfaceC14029l) {
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        abstractC6686l.mopub.registerTrigger(uri, new ExecutorC11374l(2), new C0910l(c2397l));
        Object objSignature = c2397l.Signature();
        return objSignature == EnumC9342l.f19165l ? objSignature : Unit.INSTANCE;
    }

    public static /* synthetic */ Object remoteconfig(AbstractC6686l abstractC6686l, AbstractC14619l abstractC14619l, InterfaceC14029l interfaceC14029l) {
        Object objAdmob = AbstractC11990l.admob(new C7864l(abstractC6686l, null, 2), interfaceC14029l);
        return objAdmob == EnumC9342l.f19165l ? objAdmob : Unit.INSTANCE;
    }

    public static Object subscription(AbstractC6686l abstractC6686l, AbstractC18437l abstractC18437l, InterfaceC14029l interfaceC14029l) {
        new C2397l(1, AbstractC17082l.billing(interfaceC14029l)).license();
        MeasurementManager measurementManager = abstractC6686l.mopub;
        throw null;
    }

    public static Object vip(AbstractC6686l abstractC6686l, Uri uri, InputEvent inputEvent, InterfaceC14029l interfaceC14029l) {
        C2397l c2397l = new C2397l(1, AbstractC17082l.billing(interfaceC14029l));
        c2397l.license();
        abstractC6686l.mopub.registerSource(uri, inputEvent, new ExecutorC11374l(2), new C0910l(c2397l));
        Object objSignature = c2397l.Signature();
        return objSignature == EnumC9342l.f19165l ? objSignature : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC5006l
    public Object admob(Uri uri, InterfaceC14029l interfaceC14029l) {
        return metrica(this, uri, interfaceC14029l);
    }

    public Object ads(AbstractC18437l abstractC18437l, InterfaceC14029l interfaceC14029l) {
        return subscription(this, abstractC18437l, interfaceC14029l);
    }

    @Override // defpackage.AbstractC5006l
    public Object amazon(InterfaceC14029l interfaceC14029l) {
        return firebase(this, interfaceC14029l);
    }

    @Override // defpackage.AbstractC5006l
    public Object mopub(Uri uri, InputEvent inputEvent, InterfaceC14029l interfaceC14029l) {
        return vip(this, uri, inputEvent, interfaceC14029l);
    }

    public Object smaato(AbstractC14619l abstractC14619l, InterfaceC14029l interfaceC14029l) {
        return remoteconfig(this, abstractC14619l, interfaceC14029l);
    }

    public Object startapp(AbstractC6459l abstractC6459l, InterfaceC14029l interfaceC14029l) {
        return adcel(this, abstractC6459l, interfaceC14029l);
    }

    public Object subs(AbstractC1634l abstractC1634l, InterfaceC14029l interfaceC14029l) {
        return isPro(this, abstractC1634l, interfaceC14029l);
    }
}
