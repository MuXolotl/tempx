package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lِۚٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C12100l extends AbstractC9453l {
    public static final Parcelable.Creator<C12100l> CREATOR;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public static final C4465l f24027l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final boolean f24030l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f24031l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final boolean f24032l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final double f24033l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public C13119l f24034l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f24035l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f24036l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final boolean f24037l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f24038l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C1876l f24039l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f24040l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C1901l f24041l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final List f24042l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f24043l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C4465l f24044l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final boolean f24045l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f24046l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final boolean f24047l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public static final C1876l f24029l = new C1876l(false);

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public static final C13119l f24028l = new C13119l(0);

    static {
        new C16657l(C16657l.f32623l, C16657l.f32624l, 10000L, null, AbstractC0377l.admob("smallIconDrawableResId"), AbstractC0377l.admob("stopLiveStreamDrawableResId"), AbstractC0377l.admob("pauseDrawableResId"), AbstractC0377l.admob("playDrawableResId"), AbstractC0377l.admob("skipNextDrawableResId"), AbstractC0377l.admob("skipPrevDrawableResId"), AbstractC0377l.admob("forwardDrawableResId"), AbstractC0377l.admob("forward10DrawableResId"), AbstractC0377l.admob("forward30DrawableResId"), AbstractC0377l.admob("rewindDrawableResId"), AbstractC0377l.admob("rewind10DrawableResId"), AbstractC0377l.admob("rewind30DrawableResId"), AbstractC0377l.admob("disconnectDrawableResId"), AbstractC0377l.admob("notificationImageSizeDimenResId"), AbstractC0377l.admob("castingToDeviceStringResId"), AbstractC0377l.admob("stopLiveStreamStringResId"), AbstractC0377l.admob("pauseStringResId"), AbstractC0377l.admob("playStringResId"), AbstractC0377l.admob("skipNextStringResId"), AbstractC0377l.admob("skipPrevStringResId"), AbstractC0377l.admob("forwardStringResId"), AbstractC0377l.admob("forward10StringResId"), AbstractC0377l.admob("forward30StringResId"), AbstractC0377l.admob("rewindStringResId"), AbstractC0377l.admob("rewind10StringResId"), AbstractC0377l.admob("rewind30StringResId"), AbstractC0377l.admob("disconnectStringResId"), null, false, false);
        f24027l = new C4465l("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, false);
        CREATOR = new C18485l(26);
    }

    public C12100l(String str, ArrayList arrayList, boolean z, C1901l c1901l, boolean z2, C4465l c4465l, boolean z3, double d, boolean z4, boolean z5, boolean z6, ArrayList arrayList2, boolean z7, boolean z8, C1876l c1876l, C13119l c13119l, boolean z9, boolean z10) {
        this.f24036l = true == TextUtils.isEmpty(str) ? "" : str;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList3 = new ArrayList(size);
        this.f24035l = arrayList3;
        if (size > 0) {
            arrayList3.addAll(arrayList);
        }
        this.f24031l = z;
        this.f24041l = c1901l == null ? new C1901l() : c1901l;
        this.f24040l = z2;
        this.f24044l = c4465l;
        this.f24032l = z3;
        this.f24033l = d;
        this.f24043l = z4;
        this.f24038l = z5;
        this.f24045l = z6;
        this.f24042l = arrayList2;
        this.f24030l = z7;
        this.f24046l = z8;
        this.f24039l = c1876l;
        this.f24034l = c13119l;
        this.f24037l = z9;
        this.f24047l = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iTapsense = AbstractC9968l.tapsense(parcel, 20293);
        AbstractC9968l.vip(parcel, 2, this.f24036l);
        AbstractC9968l.startapp(parcel, 3, DesugarCollections.unmodifiableList(this.f24035l));
        AbstractC9968l.subscription(parcel, 4, 4);
        parcel.writeInt(this.f24031l ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 5, this.f24041l, i);
        AbstractC9968l.subscription(parcel, 6, 4);
        parcel.writeInt(this.f24040l ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 7, this.f24044l, i);
        AbstractC9968l.subscription(parcel, 8, 4);
        parcel.writeInt(this.f24032l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 9, 8);
        parcel.writeDouble(this.f24033l);
        AbstractC9968l.subscription(parcel, 10, 4);
        parcel.writeInt(this.f24043l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 11, 4);
        parcel.writeInt(this.f24038l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 12, 4);
        parcel.writeInt(this.f24045l ? 1 : 0);
        AbstractC9968l.startapp(parcel, 13, DesugarCollections.unmodifiableList(this.f24042l));
        AbstractC9968l.subscription(parcel, 14, 4);
        parcel.writeInt(this.f24030l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 15, 4);
        parcel.writeInt(0);
        AbstractC9968l.subscription(parcel, 16, 4);
        parcel.writeInt(this.f24046l ? 1 : 0);
        AbstractC9968l.remoteconfig(parcel, 17, this.f24039l, i);
        AbstractC9968l.remoteconfig(parcel, 18, this.f24034l, i);
        AbstractC9968l.subscription(parcel, 19, 4);
        parcel.writeInt(this.f24037l ? 1 : 0);
        AbstractC9968l.subscription(parcel, 20, 4);
        parcel.writeInt(this.f24047l ? 1 : 0);
        AbstractC9968l.Signature(parcel, iTapsense);
    }
}
