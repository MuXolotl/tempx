package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* JADX INFO: renamed from: lَۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10703l extends AbstractC6998l implements Parcelable, InterfaceC0938l, InterfaceC12244l, InterfaceC8714l {
    public static final Parcelable.Creator<C10703l> CREATOR = new C10538l(0);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C12485l f21709l;

    public C10703l(long j) {
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        C12485l c12485l = new C12485l(abstractC18620lIsPro.mopub(), j);
        if (!(abstractC18620lIsPro instanceof C18661l)) {
            c12485l.loadAd = new C12485l(1L, j);
        }
        this.f21709l = c12485l;
    }

    public final long admob() {
        return ((C12485l) AbstractC9620l.Signature(this.f21709l, this)).crashlytics;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f21709l;
    }

    @Override // defpackage.AbstractC6998l, defpackage.InterfaceC2763l
    public final AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        if (((C12485l) abstractC7498l2).crashlytics == ((C12485l) abstractC7498l3).crashlytics) {
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
        return Long.valueOf(admob());
    }

    @Override // defpackage.InterfaceC0938l
    public final InterfaceC6642l loadAd() {
        return C7472l.f15463l;
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f21709l = (C12485l) abstractC7498l;
    }

    @Override // defpackage.InterfaceC8714l
    public final void setValue(Object obj) {
        subs(((Number) obj).longValue());
    }

    public final void subs(long j) {
        AbstractC18620l abstractC18620lIsPro;
        C12485l c12485l = (C12485l) AbstractC9620l.admob(this.f21709l);
        if (c12485l.crashlytics != j) {
            C12485l c12485l2 = this.f21709l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                ((C12485l) AbstractC9620l.startapp(c12485l2, this, abstractC18620lIsPro, c12485l)).crashlytics = j;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((C12485l) AbstractC9620l.admob(this.f21709l)).crashlytics + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(admob());
    }
}
