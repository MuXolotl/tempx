package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import ua.itaysonlab.vkapi2.objects.music.AudioLyricTimestamp;
import ua.itaysonlab.vkapi2.objects.music.AudioLyrics;
import ua.itaysonlab.vkapi2.objects.music.AudioLyricsContainer;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyrics;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyricsSynchronizedLine;

/* JADX INFO: renamed from: lؔۖۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2836l implements InterfaceC8180l {
    public final /* synthetic */ int yandex;
    public static final C2836l loadAd = new C2836l(0);
    public static final C2836l crashlytics = new C2836l(1);
    public static final C2836l amazon = new C2836l(2);
    public static final C2836l purchase = new C2836l(3);

    public /* synthetic */ C2836l(int i) {
        this.yandex = i;
    }

    public static InterfaceC0582l crashlytics(AudioLyricsContainer audioLyricsContainer) {
        AudioLyrics audioLyrics = audioLyricsContainer.loadAd;
        boolean zIsEmpty = audioLyrics.yandex.isEmpty();
        String str = audioLyricsContainer.crashlytics;
        if (zIsEmpty) {
            List listM4242synchronized = audioLyrics.loadAd;
            String str2 = (String) AbstractC16901l.m4212class(listM4242synchronized);
            if (str2 != null && str2.length() == 0) {
                listM4242synchronized = AbstractC16901l.m4242synchronized(1, listM4242synchronized);
            }
            return new C6143l(AbstractC16901l.m4210case(listM4242synchronized, "\n", null, null, null, 62), str);
        }
        List<AudioLyricTimestamp> list = audioLyrics.yandex;
        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
        for (AudioLyricTimestamp audioLyricTimestamp : list) {
            boolean z = audioLyricTimestamp.amazon;
            long j = audioLyricTimestamp.yandex;
            long j2 = audioLyricTimestamp.loadAd;
            arrayList.add(z ? new C6331l(j, j2) : new C11054l(audioLyricTimestamp.crashlytics, j, j2));
        }
        return new C16016l(arrayList, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r10 == r5) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object amazon(defpackage.C16864l r7, defpackage.AbstractC18643l r8, java.lang.String r9, defpackage.AbstractC0283l r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.C12435l
            if (r0 == 0) goto L13
            r0 = r10
            lؙّٚ r0 = (defpackage.C12435l) r0
            int r1 = r0.f24547l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24547l = r1
            goto L18
        L13:
            lؙّٚ r0 = new lؙّٚ
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f24548l
            int r1 = r0.f24547l
            r2 = 2
            r3 = 1
            r4 = 0
            lٍؗؐ r5 = defpackage.EnumC9342l.f19165l
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L5a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r6)
            return r4
        L31:
            lٗؓ۟ r7 = r0.f24549l
            defpackage.AbstractC2829l.crashlytics(r10)
            goto L45
        L37:
            defpackage.AbstractC2829l.crashlytics(r10)
            r0.f24549l = r7
            r0.f24547l = r3
            java.lang.Object r10 = r6.purchase(r7, r8, r9, r0)
            if (r10 != r5) goto L45
            goto L59
        L45:
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L60
            long r8 = r10.longValue()
            r0.f24549l = r4
            r0.f24547l = r2
            lؔۖۦ r6 = defpackage.C2836l.loadAd
            java.lang.Object r10 = r6.loadAd(r7, r8, r0)
            if (r10 != r5) goto L5a
        L59:
            return r5
        L5a:
            lؑۛؖ r10 = (defpackage.InterfaceC0582l) r10
            if (r10 != 0) goto L5f
            goto L60
        L5f:
            return r10
        L60:
            lؙۦؙ r6 = defpackage.C6884l.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836l.amazon(lٗؓ۟, lۡۨ, java.lang.String, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r8 == r5) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(defpackage.C16864l r9, long r10, defpackage.AbstractC0283l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2836l.loadAd(lٗؓ۟, long, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009e  */
    /* JADX WARN: Code duplicated, block: B:42:0x014f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object purchase(C16864l c16864l, AbstractC18643l abstractC18643l, String str, AbstractC0283l abstractC0283l) throws Throwable {
        C15785l c15785l;
        InterfaceC13012l interfaceC13012lYandex;
        AbstractC18643l abstractC18643l2;
        C18010l c18010lPurchase;
        C18427l c18427lAmazon;
        AbstractC18121l abstractC18121lBilling;
        if (abstractC0283l instanceof C15785l) {
            c15785l = (C15785l) abstractC0283l;
            int i = c15785l.f30995l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15785l.f30995l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15785l = new C15785l(this, abstractC0283l);
            }
        } else {
            c15785l = new C15785l(this, abstractC0283l);
        }
        Object objAdvert = c15785l.f30996l;
        int i2 = c15785l.f30995l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objAdvert);
                C6806l c6806l = new C6806l();
                AbstractC12323l.yandex(c6806l, "https://api.genius.com/search/song");
                c6806l.yandex.isPro.mo214l("q", str);
                Unit unit = Unit.INSTANCE;
                C0090l c0090l = c6806l.crashlytics;
                c0090l.mo214l("User-Agent", "Genius/4.2.1 (Android; Android 10; google Pixel 3)");
                c0090l.mo214l("X-Genius-Android-Version", "4.2.1");
                c6806l.loadAd = C17721l.loadAd;
                C3797l c3797l = new C3797l(c6806l, c16864l, 26);
                c15785l.f30997l = abstractC18643l;
                c15785l.f30995l = 1;
                objAdvert = c3797l.advert(c15785l);
                if (objAdvert != enumC9342l) {
                }
                return enumC9342l;
            }
            if (i2 == 1) {
                abstractC18643l = c15785l.f30997l;
                AbstractC2829l.crashlytics(objAdvert);
            } else {
                if (i2 != 2) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                abstractC18643l2 = c15785l.f30997l;
                AbstractC2829l.crashlytics(objAdvert);
            }
            if (objAdvert == null) {
                C6541l.subs("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
                return null;
            }
            c18010lPurchase = AbstractC1788l.purchase((C18010l) objAdvert, "response");
            if (c18010lPurchase == null && (c18427lAmazon = AbstractC1788l.amazon(c18010lPurchase, "sections")) != null) {
                ArrayList arrayListPurchase = AbstractC15011l.purchase(abstractC18643l2.getLoadAd(), AbstractC17587l.adcel(AbstractC17587l.smaato(new C11100l(new C8767l(AbstractC17587l.startapp(AbstractC17587l.firebase(new C11100l(new C17798l(1, c18427lAmazon), C17576l.f34202l), new C17049l(5)), new C17049l(6)), new C10557l(28), new C10557l(29)), new C17049l(7)), new C1698l(0))), new C6536l(3, new C17049l(8)));
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListPurchase, 10));
                Iterator it = arrayListPurchase.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C2372l) it.next()).f5132l);
                }
                C18010l c18010l = (C18010l) AbstractC16901l.m4217extends(arrayList);
                if (c18010l == null || (abstractC18121lBilling = AbstractC1788l.billing(AbstractC8358l.mopub(c18010l), "id")) == null) {
                    return null;
                }
                try {
                    return Long.valueOf(AbstractC8358l.subs(abstractC18121lBilling));
                } catch (C5114l unused) {
                    return null;
                }
            }
            interfaceC13012lYandex = AbstractC18202l.yandex(C18010l.class);
        } catch (Throwable unused2) {
            interfaceC13012lYandex = null;
        }
        C14249l c14249lLoadAd = ((AbstractC10022l) objAdvert).loadAd();
        InterfaceC1388l interfaceC1388lLoadAd = AbstractC18202l.yandex.loadAd(C18010l.class);
        C11310l c11310l = new C11310l(interfaceC1388lLoadAd, interfaceC13012lYandex);
        c15785l.f30997l = abstractC18643l;
        c15785l.f30995l = 2;
        objAdvert = c14249lLoadAd.yandex(c11310l, c15785l);
        if (objAdvert != enumC9342l) {
            abstractC18643l2 = abstractC18643l;
            if (objAdvert == null) {
                c18010lPurchase = AbstractC1788l.purchase((C18010l) objAdvert, "response");
                return c18010lPurchase == null ? null : null;
            }
            C6541l.subs("null cannot be cast to non-null type kotlinx.serialization.json.JsonObject");
            return null;
        }
        return enumC9342l;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.InterfaceC8180l
    public final Object yandex(C16864l c16864l, AbstractC18643l abstractC18643l, InterfaceC14029l interfaceC14029l) {
        C17036l c17036l;
        int i;
        CachedTrackLyrics cachedTrackLyricsStartapp;
        InterfaceC0582l c6143l;
        InterfaceC0582l interfaceC0582l;
        Object c18435l;
        InterfaceC15476l interfaceC15476l;
        C4715l c4715l;
        C2836l c2836l = this;
        AbstractC18643l abstractC18643l2 = abstractC18643l;
        int i2 = c2836l.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i3 = 1;
        switch (i2) {
            case 0:
                return AbstractC0653l.isPro(c2836l, c16864l, abstractC18643l2, (AbstractC0283l) interfaceC14029l);
            case 1:
                if (interfaceC14029l instanceof C17036l) {
                    c17036l = (C17036l) interfaceC14029l;
                    int i4 = c17036l.f33197l;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c17036l.f33197l = i4 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c17036l = new C17036l(c2836l, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c17036l = new C17036l(c2836l, (AbstractC0283l) interfaceC14029l);
                }
                Object objM3168l = c17036l.f33193l;
                int i5 = c17036l.f33197l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        int i6 = c17036l.f33198l;
                        c6143l = c17036l.f33195l;
                        AudioTrack audioTrack = c17036l.f33196l;
                        AbstractC2829l.crashlytics(objM3168l);
                        i = i6;
                        abstractC18643l2 = audioTrack;
                    } else {
                        if (i5 != 2) {
                            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        InterfaceC0582l interfaceC0582l2 = c17036l.f33195l;
                        AbstractC2829l.crashlytics(objM3168l);
                        interfaceC0582l = interfaceC0582l2;
                    }
                    if (interfaceC0582l != null) {
                        return interfaceC0582l;
                    }
                    return C6884l.INSTANCE;
                }
                AbstractC2829l.crashlytics(objM3168l);
                if (!(abstractC18643l2 instanceof AudioTrack)) {
                    return C6884l.INSTANCE;
                }
                AudioTrack audioTrack2 = (AudioTrack) abstractC18643l2;
                String strMopub = AbstractC16676l.mopub(audioTrack2);
                C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                i = 0;
                CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{strMopub}, 1))) : null;
                if (cachedTrack == null || (cachedTrackLyricsStartapp = cachedTrack.startapp()) == null) {
                    return C6884l.INSTANCE;
                }
                if (cachedTrackLyricsStartapp.crashlytics().isEmpty()) {
                    c6143l = cachedTrackLyricsStartapp.loadAd().length() > 0 ? new C6143l(cachedTrackLyricsStartapp.loadAd(), cachedTrackLyricsStartapp.yandex()) : null;
                } else {
                    String strYandex = cachedTrackLyricsStartapp.yandex();
                    InterfaceC11334l<CachedTrackLyricsSynchronizedLine> interfaceC11334lCrashlytics = cachedTrackLyricsStartapp.crashlytics();
                    ArrayList arrayList = new ArrayList(AbstractC14055l.billing(interfaceC11334lCrashlytics, 10));
                    for (CachedTrackLyricsSynchronizedLine cachedTrackLyricsSynchronizedLine : interfaceC11334lCrashlytics) {
                        arrayList.add(cachedTrackLyricsSynchronizedLine.crashlytics() ? new C6331l(cachedTrackLyricsSynchronizedLine.yandex(), cachedTrackLyricsSynchronizedLine.loadAd()) : new C11054l(cachedTrackLyricsSynchronizedLine.purchase(), cachedTrackLyricsSynchronizedLine.yandex(), cachedTrackLyricsSynchronizedLine.loadAd()));
                    }
                    c6143l = new C16016l(arrayList, strYandex);
                }
                if (c6143l != null) {
                    C6336l c6336l = C6336l.yandex;
                    c17036l.f33196l = audioTrack2;
                    c17036l.f33195l = c6143l;
                    c17036l.f33198l = 0;
                    c17036l.f33197l = 1;
                    objM3168l = C6336l.loadAd.m3168l(c17036l);
                    if (objM3168l == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return C6884l.INSTANCE;
                C5610l c5610l = new C5610l(abstractC18643l2, i3);
                c17036l.f33196l = null;
                c17036l.f33195l = c6143l;
                c17036l.f33198l = i;
                c17036l.f33197l = 2;
                if (((C5198l) objM3168l).m1734l(c5610l, c17036l) == enumC9342l) {
                    return enumC9342l;
                }
                interfaceC0582l = c6143l;
                if (interfaceC0582l != null) {
                    return interfaceC0582l;
                }
                return C6884l.INSTANCE;
            case 2:
                C16820l c16820l = abstractC18643l2 instanceof C16820l ? (C16820l) abstractC18643l2 : null;
                if (c16820l == null) {
                    return C6884l.INSTANCE;
                }
                try {
                    c18435l = C10111l.tapsense().appmetrica(new File(c16820l.admob), true);
                    break;
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                if (c18435l instanceof C18435l) {
                    c18435l = null;
                }
                C2925l c2925l = (C2925l) c18435l;
                if (c2925l == null || (interfaceC15476l = (InterfaceC15476l) AbstractC17238l.yandex(c2925l.crashlytics).billing()) == null) {
                    return C6884l.INSTANCE;
                }
                String str = (String) interfaceC15476l.subs(EnumC17969l.LYRICS).billing();
                return str == null ? C6884l.INSTANCE : new C6143l(str, null);
            default:
                if (interfaceC14029l instanceof C4715l) {
                    c4715l = (C4715l) interfaceC14029l;
                    int i7 = c4715l.f9575l;
                    if ((i7 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4715l.f9575l = i7 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c4715l = new C4715l(c2836l, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c4715l = new C4715l(c2836l, (AbstractC0283l) interfaceC14029l);
                }
                Object objAdmob = c4715l.f9576l;
                int i8 = c4715l.f9575l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(objAdmob);
                    if (abstractC18643l2 instanceof AudioTrack) {
                        AudioTrack audioTrack3 = (AudioTrack) abstractC18643l2;
                        if (audioTrack3.pro) {
                            String strMopub2 = audioTrack3.premium;
                            if (strMopub2 == null) {
                                strMopub2 = AbstractC16676l.mopub(audioTrack3);
                            }
                            C16534l c16534l = new C16534l(strMopub2, 12);
                            c4715l.f9577l = c2836l;
                            c4715l.f9575l = 1;
                            objAdmob = AbstractC8189l.admob(c16534l, c4715l);
                            if (objAdmob == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                    }
                    return C6884l.INSTANCE;
                }
                if (i8 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c2836l = c4715l.f9577l;
                AbstractC2829l.crashlytics(objAdmob);
                c2836l.getClass();
                return crashlytics((AudioLyricsContainer) objAdmob);
        }
    }
}
