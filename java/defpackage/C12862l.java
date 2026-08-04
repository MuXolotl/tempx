package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: renamed from: lّۛۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12862l implements Parcelable {
    public static final Parcelable.Creator<C12862l> CREATOR = new C17440l(4);

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final ArrayList f25299l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int[] f25300l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f25301l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f25302l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final ArrayList f25303l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int[] f25304l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final int f25305l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f25306l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int[] f25307l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final ArrayList f25308l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final CharSequence f25309l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final String f25310l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final CharSequence f25311l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final boolean f25312l;

    public C12862l(C6821l c6821l) {
        int size = c6821l.yandex.size();
        this.f25304l = new int[size * 6];
        if (!c6821l.mopub) {
            C8339l.smaato("Not on back stack");
            throw null;
        }
        this.f25303l = new ArrayList(size);
        this.f25300l = new int[size];
        this.f25307l = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C10937l c10937l = (C10937l) c6821l.yandex.get(i2);
            int i3 = i + 1;
            this.f25304l[i] = c10937l.yandex;
            ArrayList arrayList = this.f25303l;
            AbstractComponentCallbacksC4411l abstractComponentCallbacksC4411l = c10937l.loadAd;
            arrayList.add(abstractComponentCallbacksC4411l != null ? abstractComponentCallbacksC4411l.f8974l : null);
            int[] iArr = this.f25304l;
            iArr[i3] = c10937l.crashlytics ? 1 : 0;
            iArr[i + 2] = c10937l.amazon;
            iArr[i + 3] = c10937l.purchase;
            int i4 = i + 5;
            iArr[i + 4] = c10937l.billing;
            i += 6;
            iArr[i4] = c10937l.mopub;
            this.f25300l[i2] = c10937l.admob.ordinal();
            this.f25307l[i2] = c10937l.subs.ordinal();
        }
        this.f25306l = c6821l.billing;
        this.f25310l = c6821l.admob;
        this.f25301l = c6821l.subscription;
        this.f25302l = c6821l.subs;
        this.f25309l = c6821l.isPro;
        this.f25305l = c6821l.firebase;
        this.f25311l = c6821l.smaato;
        this.f25308l = c6821l.remoteconfig;
        this.f25299l = c6821l.vip;
        this.f25312l = c6821l.metrica;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f25304l);
        parcel.writeStringList(this.f25303l);
        parcel.writeIntArray(this.f25300l);
        parcel.writeIntArray(this.f25307l);
        parcel.writeInt(this.f25306l);
        parcel.writeString(this.f25310l);
        parcel.writeInt(this.f25301l);
        parcel.writeInt(this.f25302l);
        TextUtils.writeToParcel(this.f25309l, parcel, 0);
        parcel.writeInt(this.f25305l);
        TextUtils.writeToParcel(this.f25311l, parcel, 0);
        parcel.writeStringList(this.f25308l);
        parcel.writeStringList(this.f25299l);
        parcel.writeInt(this.f25312l ? 1 : 0);
    }

    public C12862l(Parcel parcel) {
        this.f25304l = parcel.createIntArray();
        this.f25303l = parcel.createStringArrayList();
        this.f25300l = parcel.createIntArray();
        this.f25307l = parcel.createIntArray();
        this.f25306l = parcel.readInt();
        this.f25310l = parcel.readString();
        this.f25301l = parcel.readInt();
        this.f25302l = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f25309l = (CharSequence) creator.createFromParcel(parcel);
        this.f25305l = parcel.readInt();
        this.f25311l = (CharSequence) creator.createFromParcel(parcel);
        this.f25308l = parcel.createStringArrayList();
        this.f25299l = parcel.createStringArrayList();
        this.f25312l = parcel.readInt() != 0;
    }
}
