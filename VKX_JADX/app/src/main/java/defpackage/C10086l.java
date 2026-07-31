package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* JADX INFO: renamed from: lََؖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10086l extends AbstractC6998l implements Parcelable, InterfaceC0938l {
    public static final Parcelable.Creator<C10086l> CREATOR = new C11384l(0);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public C13008l f20566l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC6642l f20567l;

    public C10086l(Object obj, InterfaceC6642l interfaceC6642l) {
        this.f20567l = interfaceC6642l;
        AbstractC18620l abstractC18620lIsPro = AbstractC9620l.isPro();
        C13008l c13008l = new C13008l(abstractC18620lIsPro.mopub(), obj);
        if (!(abstractC18620lIsPro instanceof C18661l)) {
            c13008l.loadAd = new C13008l(1L, obj);
        }
        this.f20566l = c13008l;
    }

    @Override // defpackage.InterfaceC2763l
    public final AbstractC7498l amazon() {
        return this.f20566l;
    }

    @Override // defpackage.AbstractC6998l, defpackage.InterfaceC2763l
    public final AbstractC7498l billing(AbstractC7498l abstractC7498l, AbstractC7498l abstractC7498l2, AbstractC7498l abstractC7498l3) {
        if (this.f20567l.firebase(((C13008l) abstractC7498l2).crashlytics, ((C13008l) abstractC7498l3).crashlytics)) {
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
        return ((C13008l) AbstractC9620l.Signature(this.f20566l, this)).crashlytics;
    }

    @Override // defpackage.InterfaceC0938l
    public final InterfaceC6642l loadAd() {
        return this.f20567l;
    }

    @Override // defpackage.InterfaceC2763l
    public final void mopub(AbstractC7498l abstractC7498l) {
        this.f20566l = (C13008l) abstractC7498l;
    }

    @Override // defpackage.InterfaceC8714l
    public final void setValue(Object obj) {
        AbstractC18620l abstractC18620lIsPro;
        C13008l c13008l = (C13008l) AbstractC9620l.admob(this.f20566l);
        if (this.f20567l.firebase(c13008l.crashlytics, obj)) {
            return;
        }
        C13008l c13008l2 = this.f20566l;
        synchronized (AbstractC9620l.crashlytics) {
            abstractC18620lIsPro = AbstractC9620l.isPro();
            ((C13008l) AbstractC9620l.startapp(c13008l2, this, abstractC18620lIsPro, c13008l)).crashlytics = obj;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC9620l.metrica(abstractC18620lIsPro, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C13008l) AbstractC9620l.admob(this.f20566l)).crashlytics + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C18450l c18450l = C18450l.f36015l;
        InterfaceC6642l interfaceC6642l = this.f20567l;
        if (AbstractC8576l.yandex(interfaceC6642l, c18450l)) {
            i2 = 0;
        } else if (AbstractC8576l.yandex(interfaceC6642l, C7472l.f15463l)) {
            i2 = 1;
        } else {
            if (!AbstractC8576l.yandex(interfaceC6642l, C1461l.f3659l)) {
                C8339l.smaato("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
