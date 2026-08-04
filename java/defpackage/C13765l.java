package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* JADX INFO: renamed from: lْۣۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13765l extends AbstractC6998l implements Parcelable, InterfaceC0938l, InterfaceC12244l, InterfaceC8714l {
    public static final Parcelable.Creator<C13765l> CREATOR = new C17440l(28);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C14802l f26859l;

    public C13765l(float f) {
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        C14802l c14802l = new C14802l(f, abstractC18620lIsPro.mopub());
        if (!(abstractC18620lIsPro instanceof C18661l)) {
            c14802l.loadAd = new C14802l(f, 1L);
        }
        this.f26859l = c14802l;
    }

    public final float admob() {
        return ((C14802l) AbstractC9620l.Signature(this.f26859l, this)).crashlytics;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f26859l;
    }

    @Override // defpackage.AbstractC6998l, defpackage.InterfaceC2763l
    public final AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        if (((C14802l) abstractC7498l2).crashlytics == ((C14802l) abstractC7498l3).crashlytics) {
            return abstractC7498l2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return Float.valueOf(admob());
    }

    @Override // defpackage.InterfaceC0938l
    public final InterfaceC6642l loadAd() {
        return C7472l.f15463l;
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f26859l = (C14802l) abstractC7498l;
    }

    @Override // defpackage.InterfaceC8714l
    public final void setValue(Object obj) {
        subs(((Number) obj).floatValue());
    }

    public final void subs(float f) {
        AbstractC18620l abstractC18620lIsPro;
        C14802l c14802l = (C14802l) AbstractC9620l.admob(this.f26859l);
        if (c14802l.crashlytics == f) {
            return;
        }
        C14802l c14802l2 = this.f26859l;
        synchronized (AbstractC9620l.crashlytics) {
            abstractC18620lIsPro = AbstractC9620l.isPro();
            ((C14802l) AbstractC9620l.startapp(c14802l2, this, abstractC18620lIsPro, c14802l)).crashlytics = f;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC9620l.metrica(abstractC18620lIsPro, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C14802l) AbstractC9620l.admob(this.f26859l)).crashlytics + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(admob());
    }
}
