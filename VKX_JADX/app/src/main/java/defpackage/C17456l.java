package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: renamed from: lٗ۠ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17456l {
    public static final String Signature;
    public static final String ad;
    public static final String advert;
    public static final String applovin;
    public static final String appmetrica;
    public static final String inmobi;
    public static final String isVip;
    public static final String license;

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public static final String f34008native;

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static final String f34009package;
    public static final String premium;

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public static final String f34010private;
    public static final String pro;
    public static final String signatures;

    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static final String f34011strictfp;
    public static final String subscription;

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final String f34012synchronized;
    public static final String tapsense;

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public static final String f34013throws;

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public static final String f34014volatile;
    public final float adcel;
    public final float admob;
    public final int ads;
    public final Bitmap amazon;
    public final int billing;
    public final Layout.Alignment crashlytics;
    public final float firebase;
    public final float isPro;
    public final Layout.Alignment loadAd;
    public final float metrica;
    public final int mopub;
    public final float purchase;
    public final int remoteconfig;
    public final boolean smaato;
    public final int startapp;
    public final int subs;
    public final int vip;
    public final CharSequence yandex;

    static {
        new C17456l("", null, null, null, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f, 0);
        String str = AbstractC15323l.yandex;
        subscription = Integer.toString(0, 36);
        tapsense = Integer.toString(17, 36);
        Signature = Integer.toString(1, 36);
        license = Integer.toString(2, 36);
        pro = Integer.toString(3, 36);
        ad = Integer.toString(18, 36);
        advert = Integer.toString(4, 36);
        isVip = Integer.toString(5, 36);
        signatures = Integer.toString(6, 36);
        premium = Integer.toString(7, 36);
        applovin = Integer.toString(8, 36);
        appmetrica = Integer.toString(9, 36);
        inmobi = Integer.toString(10, 36);
        f34013throws = Integer.toString(11, 36);
        f34009package = Integer.toString(12, 36);
        f34012synchronized = Integer.toString(13, 36);
        f34011strictfp = Integer.toString(14, 36);
        f34014volatile = Integer.toString(15, 36);
        f34008native = Integer.toString(16, 36);
        f34010private = Integer.toString(19, 36);
    }

    public C17456l(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            AbstractC12442l.admob(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.yandex = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.yandex = charSequence.toString();
        } else {
            this.yandex = null;
        }
        this.loadAd = alignment;
        this.crashlytics = alignment2;
        this.amazon = bitmap;
        this.purchase = f;
        this.billing = i;
        this.mopub = i2;
        this.admob = f2;
        this.subs = i3;
        this.isPro = f4;
        this.firebase = f5;
        this.smaato = z;
        this.remoteconfig = i5;
        this.vip = i4;
        this.metrica = f3;
        this.startapp = i6;
        this.adcel = f6;
        this.ads = i7;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x014f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.text.Spannable, android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static C17456l yandex(Bundle bundle) {
        ?? r6;
        Bitmap bitmapDecodeByteArray;
        float f;
        int i;
        float f2;
        int i2;
        int i3;
        ?? charSequence = bundle.getCharSequence(subscription);
        boolean z = true;
        if (charSequence != 0) {
            ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(tapsense);
            if (parcelableArrayList != null) {
                charSequence = SpannableString.valueOf(charSequence);
                for (Bundle bundle2 : parcelableArrayList) {
                    int i4 = bundle2.getInt(AbstractC14826l.yandex);
                    int i5 = bundle2.getInt(AbstractC14826l.loadAd);
                    int i6 = bundle2.getInt(AbstractC14826l.crashlytics);
                    int i7 = bundle2.getInt(AbstractC14826l.amazon, -1);
                    Bundle bundle3 = bundle2.getBundle(AbstractC14826l.purchase);
                    if (i7 == 1) {
                        bundle3.getClass();
                        String string = bundle3.getString(C14711l.crashlytics);
                        string.getClass();
                        charSequence.setSpan(new C14711l(string, bundle3.getInt(C14711l.amazon)), i4, i5, i6);
                    } else if (i7 == 2) {
                        bundle3.getClass();
                        charSequence.setSpan(new C13866l(bundle3.getInt(C13866l.amazon), bundle3.getInt(C13866l.purchase), bundle3.getInt(C13866l.billing)), i4, i5, i6);
                    } else if (i7 == 3) {
                        charSequence.setSpan(new C3146l(), i4, i5, i6);
                    } else if (i7 == 4) {
                        bundle3.getClass();
                        String string2 = bundle3.getString(C7148l.loadAd);
                        string2.getClass();
                        charSequence.setSpan(new C7148l(string2), i4, i5, i6);
                    }
                }
            }
        } else {
            charSequence = 0;
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(Signature);
        Layout.Alignment alignment2 = alignment != null ? alignment : null;
        Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(license);
        Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
        Bitmap bitmap = (Bitmap) bundle.getParcelable(pro);
        if (bitmap != null) {
            r6 = 0;
            bitmapDecodeByteArray = bitmap;
        } else {
            byte[] byteArray = bundle.getByteArray(ad);
            if (byteArray != null) {
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                r6 = 0;
            } else {
                r6 = charSequence;
                bitmapDecodeByteArray = null;
            }
        }
        String str = advert;
        boolean zContainsKey = bundle.containsKey(str);
        int i8 = RecyclerView.UNDEFINED_DURATION;
        if (zContainsKey) {
            String str2 = isVip;
            if (bundle.containsKey(str2)) {
                f = bundle.getFloat(str);
                i = bundle.getInt(str2);
            } else {
                f = -3.4028235E38f;
                i = Integer.MIN_VALUE;
            }
        } else {
            f = -3.4028235E38f;
            i = Integer.MIN_VALUE;
        }
        String str3 = signatures;
        int i9 = bundle.containsKey(str3) ? bundle.getInt(str3) : Integer.MIN_VALUE;
        String str4 = premium;
        float f3 = bundle.containsKey(str4) ? bundle.getFloat(str4) : -3.4028235E38f;
        String str5 = applovin;
        int i10 = bundle.containsKey(str5) ? bundle.getInt(str5) : Integer.MIN_VALUE;
        String str6 = inmobi;
        if (bundle.containsKey(str6)) {
            String str7 = appmetrica;
            if (bundle.containsKey(str7)) {
                float f4 = bundle.getFloat(str6);
                i2 = bundle.getInt(str7);
                f2 = f4;
            } else {
                f2 = -3.4028235E38f;
                i2 = Integer.MIN_VALUE;
            }
        } else {
            f2 = -3.4028235E38f;
            i2 = Integer.MIN_VALUE;
        }
        String str8 = f34013throws;
        float f5 = bundle.containsKey(str8) ? bundle.getFloat(str8) : -3.4028235E38f;
        String str9 = f34009package;
        float f6 = bundle.containsKey(str9) ? bundle.getFloat(str9) : -3.4028235E38f;
        String str10 = f34012synchronized;
        if (bundle.containsKey(str10)) {
            i3 = bundle.getInt(str10);
        } else {
            i3 = -16777216;
            z = false;
        }
        int i11 = i3;
        boolean z2 = !bundle.getBoolean(f34011strictfp, false) ? false : z;
        String str11 = f34014volatile;
        if (bundle.containsKey(str11)) {
            i8 = bundle.getInt(str11);
        }
        int i12 = i8;
        String str12 = f34008native;
        float f7 = bundle.containsKey(str12) ? bundle.getFloat(str12) : 0.0f;
        String str13 = f34010private;
        return new C17456l(r6, alignment2, alignment4, bitmapDecodeByteArray, f, i, i9, f3, i10, i2, f2, f5, f6, z2, i11, i12, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C17456l.class == obj.getClass()) {
            C17456l c17456l = (C17456l) obj;
            if (TextUtils.equals(this.yandex, c17456l.yandex) && this.loadAd == c17456l.loadAd && this.crashlytics == c17456l.crashlytics) {
                Bitmap bitmap = c17456l.amazon;
                Bitmap bitmap2 = this.amazon;
                if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                    if (this.purchase == c17456l.purchase && this.billing == c17456l.billing && this.mopub == c17456l.mopub && this.admob == c17456l.admob && this.subs == c17456l.subs && this.isPro == c17456l.isPro && this.firebase == c17456l.firebase && this.smaato == c17456l.smaato && this.remoteconfig == c17456l.remoteconfig && this.vip == c17456l.vip && this.metrica == c17456l.metrica && this.startapp == c17456l.startapp && this.adcel == c17456l.adcel && this.ads == c17456l.ads) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.yandex, this.loadAd, this.crashlytics, this.amazon, Float.valueOf(this.purchase), Integer.valueOf(this.billing), Integer.valueOf(this.mopub), Float.valueOf(this.admob), Integer.valueOf(this.subs), Float.valueOf(this.isPro), Float.valueOf(this.firebase), Boolean.valueOf(this.smaato), Integer.valueOf(this.remoteconfig), Integer.valueOf(this.vip), Float.valueOf(this.metrica), Integer.valueOf(this.startapp), Float.valueOf(this.adcel), Integer.valueOf(this.ads));
    }

    public final Bundle loadAd() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.yandex;
        if (charSequence != null) {
            bundle.putCharSequence(subscription, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = AbstractC14826l.yandex;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (C14711l c14711l : (C14711l[]) spanned.getSpans(0, spanned.length(), C14711l.class)) {
                    c14711l.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(C14711l.crashlytics, c14711l.yandex);
                    bundle2.putInt(C14711l.amazon, c14711l.loadAd);
                    arrayList.add(AbstractC14826l.yandex(spanned, c14711l, 1, bundle2));
                }
                for (C13866l c13866l : (C13866l[]) spanned.getSpans(0, spanned.length(), C13866l.class)) {
                    c13866l.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(C13866l.amazon, c13866l.yandex);
                    bundle3.putInt(C13866l.purchase, c13866l.loadAd);
                    bundle3.putInt(C13866l.billing, c13866l.crashlytics);
                    arrayList.add(AbstractC14826l.yandex(spanned, c13866l, 2, bundle3));
                }
                for (C3146l c3146l : (C3146l[]) spanned.getSpans(0, spanned.length(), C3146l.class)) {
                    arrayList.add(AbstractC14826l.yandex(spanned, c3146l, 3, null));
                }
                for (C7148l c7148l : (C7148l[]) spanned.getSpans(0, spanned.length(), C7148l.class)) {
                    c7148l.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(C7148l.loadAd, c7148l.yandex);
                    arrayList.add(AbstractC14826l.yandex(spanned, c7148l, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(tapsense, arrayList);
                }
            }
        }
        bundle.putSerializable(Signature, this.loadAd);
        bundle.putSerializable(license, this.crashlytics);
        bundle.putFloat(advert, this.purchase);
        bundle.putInt(isVip, this.billing);
        bundle.putInt(signatures, this.mopub);
        bundle.putFloat(premium, this.admob);
        bundle.putInt(applovin, this.subs);
        bundle.putInt(appmetrica, this.vip);
        bundle.putFloat(inmobi, this.metrica);
        bundle.putFloat(f34013throws, this.isPro);
        bundle.putFloat(f34009package, this.firebase);
        bundle.putBoolean(f34011strictfp, this.smaato);
        bundle.putInt(f34012synchronized, this.remoteconfig);
        bundle.putInt(f34014volatile, this.startapp);
        bundle.putFloat(f34008native, this.adcel);
        bundle.putInt(f34010private, this.ads);
        return bundle;
    }
}
