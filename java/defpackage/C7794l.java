package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: renamed from: lًؖۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7794l extends AbstractC9453l {
    public static final Parcelable.Creator<C7794l> CREATOR = new C10538l(20);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f16317l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final boolean f16318l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final List f16319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final String f16320l;

    public C7794l(ArrayList arrayList, boolean z, String str, String str2) {
        AbstractC1051l.subs(arrayList);
        this.f16319l = arrayList;
        this.f16318l = z;
        this.f16317l = str;
        this.f16320l = str2;
    }

    public static C7794l billing(List list, boolean z) {
        TreeSet treeSet = new TreeSet(C15696l.f30833l);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((InterfaceC10959l) it.next()).yandex());
        }
        return new C7794l(new ArrayList(treeSet), z, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C7794l)) {
            return false;
        }
        C7794l c7794l = (C7794l) obj;
        return this.f16318l == c7794l.f16318l && AbstractC7236l.amazon(this.f16319l, c7794l.f16319l) && AbstractC7236l.amazon(this.f16317l, c7794l.f16317l) && AbstractC7236l.amazon(this.f16320l, c7794l.f16320l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f16318l), this.f16319l, this.f16317l, this.f16320l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.ads(parcel, 1, this.f16319l);
        AbstractC9968l.subscription(parcel, 2, 4);
        parcel.writeInt(this.f16318l ? 1 : 0);
        AbstractC9968l.vip(parcel, 3, this.f16317l);
        AbstractC9968l.vip(parcel, 4, this.f16320l);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
