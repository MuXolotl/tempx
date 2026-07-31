package defpackage;

import android.media.AudioManager;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import com.google.android.material.bottomsheet.CustomBottomSheetBehavior;
import java.util.Arrays;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٍۡۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9879l {
    public final C10111l adcel;
    public final C10086l admob;
    public final C12362l ads;
    public final C10086l amazon;
    public final C10086l billing;
    public final C10086l crashlytics;
    public final C15178l firebase;
    public final C10086l isPro;
    public final C15700l loadAd = new C15700l();
    public final C10086l metrica;
    public final C10086l mopub;
    public final C10086l purchase;
    public final C11362l remoteconfig;
    public final C7119l smaato;
    public final C11644l startapp;
    public final C10086l subs;
    public final C13765l vip;
    public final AppActivity yandex;

    public C9879l(AppActivity appActivity) {
        Object c18435l;
        Object c18435l2;
        this.yandex = appActivity;
        EnumC11163l enumC11163l = EnumC11163l.f22450l;
        this.crashlytics = AbstractC8020l.smaato(enumC11163l);
        this.amazon = AbstractC8020l.smaato(C0524l.yandex);
        this.purchase = AbstractC8020l.smaato(null);
        try {
            AudioManager audioManager = (AudioManager) appActivity.getSystemService(AudioManager.class);
            c18435l = audioManager != null ? Integer.valueOf(audioManager.getStreamVolume(3)) : null;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Integer num = (Integer) (c18435l instanceof C18435l ? null : c18435l);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        try {
            AudioManager audioManager2 = (AudioManager) this.yandex.getSystemService(AudioManager.class);
            c18435l2 = audioManager2 != null ? Integer.valueOf(audioManager2.getStreamMaxVolume(3)) : null;
        } catch (Throwable th2) {
            c18435l2 = new C18435l(th2);
        }
        Integer num2 = (Integer) (c18435l2 instanceof C18435l ? null : c18435l2);
        this.billing = AbstractC8020l.smaato(new C14267l(new C14974l("", "", null, "", false, null, null), 0, EnumC11447l.f23033l, "", EnumC12501l.f24640l, false, false, false, false, false, null, false, false, iIntValue, num2 != null ? num2.intValue() : 1));
        this.mopub = AbstractC8020l.smaato(C10507l.crashlytics);
        this.admob = AbstractC8020l.smaato(null);
        this.subs = AbstractC8020l.smaato(new C0217l(0.0f, i, i, 31));
        this.isPro = AbstractC8020l.smaato(new C6678l(C11507l.f23131l, 0));
        C17253l c17253l = AbstractC15645l.yandex;
        this.firebase = new C15178l(true, AbstractC8752l.yandex);
        this.smaato = AbstractC12098l.yandex(0, 2, null, 5);
        this.remoteconfig = new C11362l();
        this.vip = new C13765l(1.0f);
        this.metrica = AbstractC8020l.smaato(Boolean.TRUE);
        this.startapp = new C11644l(1);
        this.adcel = new C10111l(15);
        this.ads = new C12362l();
        this.crashlytics.setValue(enumC11163l);
        this.amazon.setValue(new C0483l(this));
    }

    public static final void billing(C9879l c9879l, AbstractC18643l abstractC18643l) {
        C11362l c11362l = c9879l.remoteconfig;
        c11362l.clear();
        c11362l.add(EnumC11215l.f22577l);
        boolean z = abstractC18643l instanceof AudioTrack;
        if (z) {
            AudioTrack audioTrack = (AudioTrack) abstractC18643l;
            int i = audioTrack.loadAd;
            long j = audioTrack.crashlytics;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append('_');
            sb.append(i);
            String string = sb.toString();
            C5198l c5198lM3161l = C6336l.loadAd.m3161l();
            if ((c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{string}, 1))) : null) != null) {
                c11362l.add(EnumC11215l.f22580l);
            } else {
                c11362l.add(EnumC11215l.f22581l);
            }
            c11362l.add(EnumC11215l.f22583l);
            EnumC11215l enumC11215l = EnumC11215l.f22578l;
            c11362l.add(enumC11215l);
            if (audioTrack.purchase() == 2) {
                c11362l.remove(enumC11215l);
            }
        }
        if (!z) {
            UmaTrack umaTrack = abstractC18643l instanceof UmaTrack ? (UmaTrack) abstractC18643l : null;
            String str = umaTrack != null ? umaTrack.tapsense : null;
            if (str == null || str.length() == 0) {
                return;
            }
        }
        c11362l.add(EnumC11215l.f22579l);
    }

    public static void smaato(C10507l c10507l) {
        C16076l c16076l = VKXApplication.f36632l;
        InterfaceC14029l interfaceC14029l = null;
        if (c16076l == null) {
            c16076l = null;
        }
        String str = c10507l.yandex;
        c16076l.getClass();
        c16076l.subs(new C8568l(c16076l, str, interfaceC14029l, 7));
    }

    public static void startapp(int i) {
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        AudioManager audioManager = (AudioManager) c16076l.f31522l.getValue();
        if (audioManager != null) {
            AudioManager audioManager2 = (AudioManager) c16076l.f31522l.getValue();
            int streamMaxVolume = audioManager2 != null ? audioManager2.getStreamMaxVolume(3) : 0;
            if (i > streamMaxVolume) {
                i = streamMaxVolume;
            }
            audioManager.setStreamVolume(3, i, 0);
        }
    }

    public final void admob() {
        C13042l.f25547l.yandex();
        this.yandex.f36642l.amazon(false);
        this.purchase.setValue(null);
        vip(EnumC15095l.f29627l);
    }

    public final void amazon(C6956l c6956l, int i) {
        c6956l.m2133new(1182034700);
        int i2 = 2;
        int i3 = (c6956l.admob(this) ? 4 : 2) | i;
        if (c6956l.m2127for(i3 & 1, (i3 & 3) != 2)) {
            C1424l c1424l = VKXApplication.f36627l;
            if (c1424l == null) {
                c1424l = null;
            }
            InterfaceC6942l interfaceC6942lYandex = ((InterfaceC15829l) c1424l.f3602l).yandex();
            C1424l c1424l2 = VKXApplication.f36627l;
            Object obj = (c1424l2 != null ? c1424l2 : null).f3602l;
            InterfaceC8714l interfaceC8714lLoadAd = AbstractC3700l.loadAd(interfaceC6942lYandex, (C18554l) ((AbstractC11904l) C8993l.f18539l.f33214l), c6956l, 0);
            C14267l c14267lFirebase = firebase();
            if (((Boolean) this.metrica.getValue()).booleanValue() || !((C18554l) interfaceC8714lLoadAd.getValue()).f36230l) {
                c6956l.m2123default(-477038474);
            } else {
                c6956l.m2123default(-440776720);
                AbstractC11028l.billing(c6956l, 0);
            }
            c6956l.startapp(false);
            AbstractC7876l.yandex((C0764l) this.loadAd.crashlytics.getValue(), AbstractC14566l.amazon(-1334696552, new C11768l(this, c14267lFirebase, i2), c6956l), c6956l, 48, 0);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C9802l(this, i);
        }
    }

    public final void crashlytics(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        boolean z;
        c6956l.m2133new(-1583031439);
        int i2 = 2;
        int i3 = i | (c6956l.billing(interfaceC17242l) ? 4 : 2) | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            C3981l c3981l = (C3981l) this.admob.getValue();
            if (c3981l != null) {
                c6956l.m2123default(-1348463859);
                boolean zBilling = c6956l.billing(c3981l);
                Object objM2132native = c6956l.m2132native();
                Object obj = C1867l.yandex;
                if (zBilling || objM2132native == obj) {
                    int i4 = c3981l.yandex;
                    C13802l c13802l = new C13802l(13, c3981l);
                    C6157l c6157l = AbstractC10521l.yandex;
                    Object c2887l = new C2887l(i4, 0.0f, c13802l);
                    c6956l.m2147try(c2887l);
                    objM2132native = c2887l;
                }
                AbstractC13264l abstractC13264l = (AbstractC13264l) objM2132native;
                Integer numValueOf = Integer.valueOf(abstractC13264l.metrica());
                boolean zBilling2 = c6956l.billing(abstractC13264l) | c6956l.billing(c3981l);
                Object objM2132native2 = c6956l.m2132native();
                if (zBilling2 || objM2132native2 == obj) {
                    objM2132native2 = new C13624l(abstractC13264l, c3981l, null, 10);
                    c6956l.m2147try(objM2132native2);
                }
                AbstractC12311l.amazon(c6956l, numValueOf, (Function2) objM2132native2);
                z = false;
                AbstractC7252l.yandex(abstractC13264l, interfaceC17242l, null, null, 0.0f, null, null, false, null, null, null, AbstractC14566l.amazon(-1252185387, new C4508l(i2, c3981l), c6956l), c6956l, (i3 << 3) & 112, 24576, 16380);
            } else {
                z = false;
                c6956l.m2123default(-1390784687);
            }
            c6956l.startapp(z);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17626l(this, interfaceC17242l, i, 1);
        }
    }

    public final C14267l firebase() {
        return (C14267l) this.billing.getValue();
    }

    public final C10507l isPro() {
        return (C10507l) this.mopub.getValue();
    }

    public final void loadAd(InterfaceC17242l interfaceC17242l, C6956l c6956l, int i) {
        c6956l.m2133new(522250942);
        int i2 = 0;
        if (c6956l.m2127for(i & 1, (i & 3) != 2)) {
            AbstractC3274l.yandex(interfaceC17242l, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC9637l.crashlytics, c6956l, 12582918, 126);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C17626l(this, interfaceC17242l, i, i2);
        }
    }

    public final void metrica(C14267l c14267l) {
        this.billing.setValue(c14267l);
    }

    public final void mopub() {
        if (firebase().crashlytics == EnumC11447l.f23032l) {
            C16076l c16076l = VKXApplication.f36632l;
            (c16076l != null ? c16076l : null).isPro();
        } else {
            C16076l c16076l2 = VKXApplication.f36632l;
            (c16076l2 != null ? c16076l2 : null).smaato();
        }
    }

    public final void purchase(C15578l c15578l, C15578l c15578l2, boolean z, Function0 function0, C6956l c6956l, int i) {
        C15578l c15578l3;
        c6956l.m2133new(-567513447);
        int i2 = i | (c6956l.mopub(z) ? 2048 : 1024) | (c6956l.admob(function0) ? 16384 : 8192);
        if (c6956l.m2127for(i2 & 1, (i2 & 9363) != 9362)) {
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            AbstractC2812l.pro(6, c15578l, c6956l, true);
            InterfaceC17242l interfaceC17242lStartapp = AbstractC3605l.startapp(AbstractC0080l.amazon(c4346l, 1.0f), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            WeakHashMap weakHashMap = C12923l.pro;
            InterfaceC17242l interfaceC17242lSubscription = AbstractC2697l.subscription(AbstractC17549l.amazon(interfaceC17242lStartapp, new C1628l(C6760l.smaato(c6956l).smaato, 48)), AbstractC2697l.loadAd);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSubscription);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            c15578l3 = c15578l2;
            c15578l3.invoke(C18295l.yandex, c6956l, 54);
            c6956l.m2123default(458224636);
            c6956l.startapp(false);
            AbstractC7470l.billing(function0, null, false, null, null, null, AbstractC14566l.amazon(672379291, new C4584l(z, 4), c6956l), c6956l, ((i2 >> 12) & 14) | 1572864, 62);
            c6956l.startapp(true);
        } else {
            c15578l3 = c15578l2;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8076l(this, c15578l, c15578l3, z, function0, i);
        }
    }

    public final void remoteconfig(C10507l c10507l) {
        AbstractC18643l abstractC18643l = c10507l.loadAd;
        boolean z = abstractC18643l instanceof AudioTrack;
        AppActivity appActivity = this.yandex;
        if (z) {
            int i = C4456l.f9065l;
            AbstractC4115l.amazon((AudioTrack) abstractC18643l, new C12858l(this, c10507l, 0)).Signature(appActivity);
        } else if (abstractC18643l instanceof UmaTrack) {
            AbstractC9033l.crashlytics(appActivity, new C9181l(c10507l, this, null, 27));
        }
    }

    public final C0217l subs() {
        return (C0217l) this.subs.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    public final void vip(EnumC15095l enumC15095l) {
        CustomBottomSheetBehavior customBottomSheetBehavior;
        AbstractC10026l.yandex(enumC15095l);
        AppActivity appActivity = this.yandex;
        appActivity.f36637l.crashlytics(new C3755l(3));
        C13530l c13530l = appActivity.f36642l;
        if (c13530l.loadAd()) {
            CustomBottomSheetBehavior customBottomSheetBehavior2 = c13530l.amazon;
            int i = 4;
            if ((customBottomSheetBehavior2 != null ? customBottomSheetBehavior2 : null).f645private == 4) {
                if (customBottomSheetBehavior2 != null) {
                    customBottomSheetBehavior = customBottomSheetBehavior2;
                } else {
                    customBottomSheetBehavior = null;
                }
                if (enumC15095l == EnumC15095l.f29628l) {
                    if (customBottomSheetBehavior2 == null) {
                        customBottomSheetBehavior2 = null;
                    }
                    customBottomSheetBehavior2.premium(false);
                } else {
                    if (customBottomSheetBehavior2 == null) {
                        customBottomSheetBehavior2 = null;
                    }
                    customBottomSheetBehavior2.premium(true);
                    i = 5;
                }
                customBottomSheetBehavior.appmetrica(i);
            } else {
                if ((customBottomSheetBehavior2 != null ? customBottomSheetBehavior2 : null).f645private == 5) {
                    if (customBottomSheetBehavior2 != null) {
                        customBottomSheetBehavior = customBottomSheetBehavior2;
                    } else {
                        customBottomSheetBehavior = null;
                    }
                    if (enumC15095l == EnumC15095l.f29628l) {
                        if (customBottomSheetBehavior2 == null) {
                            customBottomSheetBehavior2 = null;
                        }
                        customBottomSheetBehavior2.premium(false);
                    } else {
                        if (customBottomSheetBehavior2 == null) {
                            customBottomSheetBehavior2 = null;
                        }
                        customBottomSheetBehavior2.premium(true);
                        i = 5;
                    }
                    customBottomSheetBehavior.appmetrica(i);
                }
            }
        }
        if (c13530l.loadAd() && enumC15095l == EnumC15095l.f29627l) {
            CustomBottomSheetBehavior customBottomSheetBehavior3 = c13530l.amazon;
            if (customBottomSheetBehavior3 == null) {
                customBottomSheetBehavior3 = null;
            }
            customBottomSheetBehavior3.premium(true);
            CustomBottomSheetBehavior customBottomSheetBehavior4 = c13530l.amazon;
            (customBottomSheetBehavior4 != null ? customBottomSheetBehavior4 : null).appmetrica(5);
        }
    }

    public final void yandex(C15578l c15578l, C15578l c15578l2, C15578l c15578l3, C15578l c15578l4, Function0 function0, C6956l c6956l, int i) {
        C15578l c15578l5;
        C15578l c15578l6;
        C15578l c15578l7;
        c6956l.m2133new(-642273693);
        int i2 = i | (c6956l.admob(function0) ? 1048576 : 524288);
        if (c6956l.m2127for(i2 & 1, (599187 & i2) != 599186)) {
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i3 = (int) (j ^ (j >>> 32));
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            C4346l c4346l = C4346l.f8873l;
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, c4346l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            C6415l c6415l = C3438l.mopub;
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, c6415l);
            C6415l c6415l2 = C3438l.billing;
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, c6415l2);
            Integer numValueOf = Integer.valueOf(i3);
            C6415l c6415l3 = C3438l.isPro;
            AbstractC8182l.billing(c6956l, numValueOf, c6415l3);
            C11192l c11192l = C3438l.firebase;
            AbstractC8182l.purchase(c6956l, c11192l);
            C6415l c6415l4 = C3438l.amazon;
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, c6415l4);
            c15578l.invoke(c6956l, 6);
            c6956l.startapp(true);
            InterfaceC17242l interfaceC17242lVip = AbstractC3605l.vip(AbstractC0080l.amazon(c4346l, 1.0f), 16.0f, 0.0f, 2);
            WeakHashMap weakHashMap = C12923l.pro;
            InterfaceC17242l interfaceC17242lSubscription = AbstractC2697l.subscription(AbstractC17549l.amazon(interfaceC17242lVip, new C1628l(C6760l.smaato(c6956l).smaato, 48)), AbstractC2697l.loadAd);
            C5062l c5062lYandex = AbstractC7001l.yandex(new C7537l(12.0f, true, new C8339l(12)), C18450l.f36040l, c6956l, 54);
            long j2 = c6956l.f14595continue;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato2 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling2 = AbstractC17541l.billing(c6956l, interfaceC17242lSubscription);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c5062lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato2, c6415l2);
            AbstractC11043l.isPro(i4, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling2, c6415l4);
            AbstractC9637l.yandex.invoke(c6956l, 6);
            C9247l c9247l = new C9247l(1.0f, true);
            C1853l c1853lYandex = AbstractC1001l.yandex(AbstractC8313l.crashlytics, C18450l.f36046l, c6956l, 0);
            long j3 = c6956l.f14595continue;
            int i5 = (int) (j3 ^ (j3 >>> 32));
            InterfaceC18556l interfaceC18556lSmaato3 = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling3 = AbstractC17541l.billing(c6956l, c9247l);
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, c1853lYandex, c6415l);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato3, c6415l2);
            AbstractC11043l.isPro(i5, c6956l, c6415l3, c6956l, c11192l);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling3, c6415l4);
            C8540l c8540l = AbstractC13010l.yandex;
            C10707l c10707l = AbstractC16964l.yandex;
            C10092l c10092lYandex = c8540l.yandex(((C14370l) c6956l.isPro(c10707l)).loadAd.isPro);
            C8540l c8540l2 = AbstractC12502l.yandex;
            c15578l5 = c15578l2;
            AbstractC10478l.loadAd(new C10092l[]{c10092lYandex, AbstractC5020l.startapp(((C14370l) c6956l.isPro(c10707l)).yandex.adcel, c8540l2)}, c15578l5, c6956l, 56);
            c15578l6 = c15578l3;
            AbstractC10478l.loadAd(new C10092l[]{c8540l.yandex(((C14370l) c6956l.isPro(c10707l)).loadAd.firebase), AbstractC5020l.startapp(((C14370l) c6956l.isPro(c10707l)).yandex.subscription, c8540l2)}, c15578l6, c6956l, 56);
            c6956l.startapp(true);
            c6956l.m2123default(390094223);
            c15578l7 = c15578l4;
            c15578l7.invoke(c6956l, 6);
            c6956l.startapp(false);
            Unit unit = Unit.INSTANCE;
            AbstractC7470l.billing(function0, null, false, null, null, null, AbstractC14566l.amazon(731464165, new C3755l(17), c6956l), c6956l, ((i2 >> 18) & 14) | 1572864, 62);
            c6956l.startapp(true);
        } else {
            c15578l5 = c15578l2;
            c15578l6 = c15578l3;
            c15578l7 = c15578l4;
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C8088l(this, c15578l, c15578l5, c15578l6, c15578l7, function0, i);
        }
    }
}
