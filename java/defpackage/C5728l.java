package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: lؘٖ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5728l {
    public static final String Signature;
    public static final String ad;
    public static final String adcel;
    public static final String ads;
    public static final String advert;
    public static final String applovin;
    public static final String isVip;
    public static final String license;
    public static final String metrica;
    public static final String premium;
    public static final String pro;
    public static final String signatures;
    public static final String startapp;
    public static final String subscription;
    public static final String tapsense;
    public final Bundle admob;
    public final PendingIntent amazon;
    public final C16616l billing;
    public final InterfaceC4725l crashlytics;
    public final AbstractC1186l firebase;
    public final C1908l isPro;
    public final int loadAd;
    public final C16616l mopub;
    public final C14023l purchase;
    public final MediaSession.Token remoteconfig;
    public final AbstractC1186l smaato;
    public final Bundle subs;
    public final AbstractC1186l vip;
    public final int yandex;

    static {
        String str = AbstractC15323l.yandex;
        metrica = Integer.toString(0, 36);
        startapp = Integer.toString(1, 36);
        adcel = Integer.toString(2, 36);
        ads = Integer.toString(9, 36);
        subscription = Integer.toString(14, 36);
        tapsense = Integer.toString(13, 36);
        Signature = Integer.toString(3, 36);
        license = Integer.toString(4, 36);
        pro = Integer.toString(5, 36);
        ad = Integer.toString(6, 36);
        advert = Integer.toString(11, 36);
        isVip = Integer.toString(7, 36);
        signatures = Integer.toString(8, 36);
        premium = Integer.toString(10, 36);
        applovin = Integer.toString(12, 36);
    }

    public C5728l(int i, int i2, InterfaceC4725l interfaceC4725l, PendingIntent pendingIntent, AbstractC1186l abstractC1186l, AbstractC1186l abstractC1186l2, AbstractC1186l abstractC1186l3, C14023l c14023l, C16616l c16616l, C16616l c16616l2, Bundle bundle, Bundle bundle2, C1908l c1908l, MediaSession.Token token) {
        this.yandex = i;
        this.loadAd = i2;
        this.crashlytics = interfaceC4725l;
        this.amazon = pendingIntent;
        this.firebase = abstractC1186l;
        this.smaato = abstractC1186l2;
        this.vip = abstractC1186l3;
        this.purchase = c14023l;
        this.billing = c16616l;
        this.mopub = c16616l2;
        this.admob = bundle;
        this.subs = bundle2;
        this.isPro = c1908l;
        this.remoteconfig = token;
    }

    public static C5728l yandex(Bundle bundle) {
        C13708l c13708lMopub;
        C13708l c13708lMopub2;
        C13708l c13708lMopub3;
        InterfaceC4725l interfaceC4725l;
        InterfaceC4725l interfaceC4725l2;
        IBinder binder = bundle.getBinder(premium);
        if (binder instanceof BinderC17702l) {
            return ((BinderC17702l) binder).purchase;
        }
        int i = bundle.getInt(metrica, 0);
        int i2 = bundle.getInt(signatures, 0);
        IBinder binder2 = bundle.getBinder(startapp);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(adcel);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(ads);
        if (parcelableArrayList != null) {
            C16971l c16971lMetrica = AbstractC1186l.metrica();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                c16971lMetrica.crashlytics(C14869l.subs(i2, bundle2));
            }
            c13708lMopub = c16971lMetrica.mopub();
        } else {
            C9258l c9258l = AbstractC1186l.f3181l;
            c13708lMopub = C13708l.f26763l;
        }
        C13708l c13708l = c13708lMopub;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(subscription);
        if (parcelableArrayList2 != null) {
            C16971l c16971lMetrica2 = AbstractC1186l.metrica();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                c16971lMetrica2.crashlytics(C14869l.subs(i2, bundle3));
            }
            c13708lMopub2 = c16971lMetrica2.mopub();
        } else {
            C9258l c9258l2 = AbstractC1186l.f3181l;
            c13708lMopub2 = C13708l.f26763l;
        }
        C13708l c13708l2 = c13708lMopub2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(tapsense);
        if (parcelableArrayList3 != null) {
            C16971l c16971lMetrica3 = AbstractC1186l.metrica();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                c16971lMetrica3.crashlytics(C14869l.subs(i2, bundle4));
            }
            c13708lMopub3 = c16971lMetrica3.mopub();
        } else {
            C9258l c9258l3 = AbstractC1186l.f3181l;
            c13708lMopub3 = C13708l.f26763l;
        }
        C13708l c13708l3 = c13708lMopub3;
        Bundle bundle5 = bundle.getBundle(Signature);
        C14023l c14023lLoadAd = bundle5 == null ? C14023l.loadAd : C14023l.loadAd(bundle5);
        Bundle bundle6 = bundle.getBundle(pro);
        C16616l c16616lLoadAd = bundle6 == null ? C16616l.loadAd : C16616l.loadAd(bundle6);
        Bundle bundle7 = bundle.getBundle(license);
        C16616l c16616lLoadAd2 = bundle7 == null ? C16616l.loadAd : C16616l.loadAd(bundle7);
        Bundle bundleStartapp = AbstractC15323l.startapp(bundle.getBundle(ad));
        Bundle bundleStartapp2 = AbstractC15323l.startapp(bundle.getBundle(advert));
        Bundle bundle8 = bundle.getBundle(isVip);
        C1908l c1908lAds = bundle8 == null ? C1908l.f4358synchronized : C1908l.ads(i2, bundle8);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(applovin);
        Bundle bundle9 = bundleStartapp2;
        int i6 = BinderC4841l.smaato;
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC4725l)) {
            C0337l c0337l = new C0337l();
            c0337l.purchase = iBinder;
            interfaceC4725l = c0337l;
        } else {
            interfaceC4725l2 = (InterfaceC4725l) iInterfaceQueryLocalInterface;
        }
        if (bundleStartapp == null) {
            interfaceC4725l = interfaceC4725l2;
            bundleStartapp = Bundle.EMPTY;
        }
        interfaceC4725l = interfaceC4725l2;
        Bundle bundle10 = bundleStartapp;
        if (bundle9 == null) {
            bundle9 = Bundle.EMPTY;
        }
        return new C5728l(i, i2, interfaceC4725l, pendingIntent, c13708l, c13708l2, c13708l3, c14023lLoadAd, c16616lLoadAd2, c16616lLoadAd, bundle10, bundle9, c1908lAds, token);
    }

    public final Bundle loadAd(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(metrica, this.yandex);
        bundle.putBinder(startapp, this.crashlytics.asBinder());
        bundle.putParcelable(adcel, this.amazon);
        AbstractC1186l abstractC1186l = this.firebase;
        boolean zIsEmpty = abstractC1186l.isEmpty();
        String str = ads;
        if (!zIsEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC1186l.size());
            Iterator<E> it = abstractC1186l.iterator();
            while (it.hasNext()) {
                arrayList.add(((C14869l) it.next()).metrica(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        AbstractC1186l abstractC1186l2 = this.smaato;
        if (!abstractC1186l2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(abstractC1186l2.size());
                Iterator<E> it2 = abstractC1186l2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C14869l) it2.next()).metrica(i));
                }
                bundle.putParcelableArrayList(subscription, arrayList2);
            } else {
                C13708l c13708lIsPro = C14869l.isPro(abstractC1186l2, true, true, 9);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(c13708lIsPro.f26765l);
                C9258l c9258lListIterator = c13708lIsPro.listIterator(0);
                while (c9258lListIterator.hasNext()) {
                    arrayList3.add(((C14869l) c9258lListIterator.next()).metrica(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        AbstractC1186l abstractC1186l3 = this.vip;
        if (!abstractC1186l3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(abstractC1186l3.size());
            Iterator<E> it3 = abstractC1186l3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((C14869l) it3.next()).metrica(i));
            }
            bundle.putParcelableArrayList(tapsense, arrayList4);
        }
        C14023l c14023l = this.purchase;
        c14023l.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        AbstractC10199l it4 = c14023l.yandex.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((C12417l) it4.next()).loadAd());
        }
        bundle2.putParcelableArrayList(C14023l.crashlytics, arrayList5);
        bundle.putBundle(Signature, bundle2);
        String str2 = license;
        C16616l c16616l = this.billing;
        bundle.putBundle(str2, c16616l.crashlytics());
        String str3 = pro;
        C16616l c16616l2 = this.mopub;
        bundle.putBundle(str3, c16616l2.crashlytics());
        bundle.putBundle(ad, this.admob);
        bundle.putBundle(advert, this.subs);
        bundle.putBundle(isVip, this.isPro.adcel(AbstractC8672l.amazon(c16616l, c16616l2), false, false).tapsense(i));
        bundle.putInt(signatures, this.loadAd);
        MediaSession.Token token = this.remoteconfig;
        if (token != null) {
            bundle.putParcelable(applovin, token);
        }
        return bundle;
    }
}
