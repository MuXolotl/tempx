package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* JADX INFO: renamed from: lٔۦؙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15308l extends AbstractC6998l implements Parcelable, InterfaceC0938l, InterfaceC12244l, InterfaceC8714l {
    public static final Parcelable.Creator<C15308l> CREATOR = new C17440l(29);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public C15632l f29916l;

    public C15308l(int i) {
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        C15632l c15632l = new C15632l(abstractC18620lIsPro.mopub(), i);
        if (!(abstractC18620lIsPro instanceof C18661l)) {
            c15632l.loadAd = new C15632l(1L, i);
        }
        this.f29916l = c15632l;
    }

    public final int admob() {
        return ((C15632l) AbstractC9620l.Signature(this.f29916l, this)).crashlytics;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f29916l;
    }

    @Override // defpackage.AbstractC6998l, defpackage.InterfaceC2763l
    public final AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        if (((C15632l) abstractC7498l2).crashlytics == ((C15632l) abstractC7498l3).crashlytics) {
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
        return Integer.valueOf(admob());
    }

    @Override // defpackage.InterfaceC0938l
    public final InterfaceC6642l loadAd() {
        return C7472l.f15463l;
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f29916l = (C15632l) abstractC7498l;
    }

    @Override // defpackage.InterfaceC8714l
    public final void setValue(Object obj) {
        subs(((Number) obj).intValue());
    }

    public final void subs(int i) {
        AbstractC18620l abstractC18620lIsPro;
        C15632l c15632l = (C15632l) AbstractC9620l.admob(this.f29916l);
        if (c15632l.crashlytics != i) {
            C15632l c15632l2 = this.f29916l;
            synchronized (AbstractC9620l.crashlytics) {
                abstractC18620lIsPro = AbstractC9620l.isPro();
                ((C15632l) AbstractC9620l.startapp(c15632l2, this, abstractC18620lIsPro, c15632l)).crashlytics = i;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC9620l.metrica(abstractC18620lIsPro, this);
        }
    }

    public final String toString() {
        return AbstractC12589l.premium(((C15632l) AbstractC9620l.admob(this.f29916l)).crashlytics, hashCode(), "MutableIntState(value=", ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(admob());
    }
}
