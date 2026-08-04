package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lُِّ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11761l implements InterfaceC8308l {
    public final /* synthetic */ int yandex;
    public static final C11761l loadAd = new C11761l(0);
    public static final C11761l crashlytics = new C11761l(1);
    public static final C11761l amazon = new C11761l(2);

    public /* synthetic */ C11761l(int i) {
        this.yandex = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object crashlytics(AudioPlaylist audioPlaylist, AbstractC0283l abstractC0283l) {
        C0029l c0029l;
        C1501l c1501l;
        if (abstractC0283l instanceof C0029l) {
            c0029l = (C0029l) abstractC0283l;
            int i = c0029l.f878l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c0029l.f878l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c0029l = new C0029l(this, abstractC0283l);
            }
        } else {
            c0029l = new C0029l(this, abstractC0283l);
        }
        Object obj = c0029l.f879l;
        int i2 = c0029l.f878l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            if (audioPlaylist != null) {
                C1501l c1501l2 = C1501l.billing;
                C11485l c11485l = C11485l.f23075l;
                long j = audioPlaylist.amazon;
                int i3 = audioPlaylist.crashlytics;
                c0029l.f880l = c1501l2;
                c0029l.f878l = 1;
                Object objVip = c11485l.vip(i3, j, c0029l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objVip == enumC9342l) {
                    return enumC9342l;
                }
                c1501l = c1501l2;
                obj = objVip;
            }
            return null;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c1501l = c0029l.f880l;
        AbstractC2829l.crashlytics(obj);
        CachedPlaylist cachedPlaylist = (CachedPlaylist) obj;
        if (cachedPlaylist != null) {
            c1501l.getClass();
            return C1501l.loadAd(cachedPlaylist);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        if (java.lang.Math.max(r6, r9 != null ? r9.yandex : 0) >= 1200) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(ua.itaysonlab.vkapi2.objects.music.AudioTrack r7, defpackage.C9192l r8, defpackage.C3548l r9, defpackage.AbstractC0283l r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11761l.loadAd(ua.itaysonlab.vkapi2.objects.music.AudioTrack, lٌۦً, lٟؕٚ, lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:104:0x01de  */
    /* JADX WARN: Code duplicated, block: B:107:0x0203  */
    /* JADX WARN: Code duplicated, block: B:110:0x0217  */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab  */
    @Override // defpackage.InterfaceC8308l
    public final Object yandex(C13218l c13218l, InterfaceC14029l interfaceC14029l) throws Throwable {
        C8844l c8844l;
        AudioTrack audioTrack;
        C13218l c13218l2;
        String str;
        Object objCrashlytics;
        C12608l c12608l;
        Object objCrashlytics2;
        String strPremium;
        C14025l c14025lAdmob;
        int i = this.yandex;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        String strTapsense = null;
        switch (i) {
            case 0:
                if (interfaceC14029l instanceof C8844l) {
                    c8844l = (C8844l) interfaceC14029l;
                    int i2 = c8844l.f18180l;
                    if ((i2 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c8844l.f18180l = i2 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c8844l = new C8844l(this, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c8844l = new C8844l(this, (AbstractC0283l) interfaceC14029l);
                }
                Object objLoadAd = c8844l.f18176l;
                switch (c8844l.f18180l) {
                    case 0:
                        AbstractC2829l.crashlytics(objLoadAd);
                        C7819l c7819l = c13218l.amazon;
                        Object obj = c7819l.loadAd;
                        audioTrack = obj instanceof AudioTrack ? (AudioTrack) obj : null;
                        InterfaceC0476l interfaceC0476l = c7819l.ads;
                        c8844l.f18179l = c13218l;
                        c8844l.f18178l = this;
                        c8844l.f18181l = audioTrack;
                        c8844l.f18180l = 1;
                        objLoadAd = interfaceC0476l.loadAd(c8844l);
                        if (objLoadAd == enumC9342l) {
                            return enumC9342l;
                        }
                        C3548l c3548l = c13218l.amazon.Signature;
                        c8844l.f18179l = c13218l;
                        c8844l.f18178l = null;
                        c8844l.f18181l = null;
                        c8844l.f18180l = 2;
                        objLoadAd = this.loadAd(audioTrack, (C9192l) objLoadAd, c3548l, c8844l);
                        if (objLoadAd == enumC9342l) {
                            return enumC9342l;
                        }
                        c13218l2 = c13218l;
                        str = (String) objLoadAd;
                        if (str == null) {
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 6;
                            objCrashlytics = c13218l2.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (str.length() > 0) {
                            C9477l c9477lYandex = C7819l.yandex(c13218l2.amazon);
                            c9477lYandex.crashlytics = str;
                            C13218l c13218lAmazon = c13218l2.amazon(c9477lYandex.yandex());
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 3;
                            objCrashlytics = c13218lAmazon.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (AbstractC8576l.yandex(c13218l2.amazon.Signature.yandex.get(C12014l.f23938l), Boolean.TRUE)) {
                            C9477l c9477lYandex2 = C7819l.yandex(c13218l2.amazon);
                            c9477lYandex2.crashlytics = new Integer(R.drawable.generic_audio_nowplaying);
                            C13218l c13218lAmazon2 = c13218l2.amazon(c9477lYandex2.yandex());
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 4;
                            objCrashlytics = c13218lAmazon2.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            C13218l c13218lAmazon3 = c13218l2.amazon(c13218l2.amazon);
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 5;
                            objCrashlytics = c13218lAmazon3.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return objCrashlytics;
                    case 1:
                        AudioTrack audioTrack2 = c8844l.f18181l;
                        C11761l c11761l = c8844l.f18178l;
                        C13218l c13218l3 = c8844l.f18179l;
                        AbstractC2829l.crashlytics(objLoadAd);
                        audioTrack = audioTrack2;
                        this = c11761l;
                        c13218l = c13218l3;
                        C3548l c3548l2 = c13218l.amazon.Signature;
                        c8844l.f18179l = c13218l;
                        c8844l.f18178l = null;
                        c8844l.f18181l = null;
                        c8844l.f18180l = 2;
                        objLoadAd = this.loadAd(audioTrack, (C9192l) objLoadAd, c3548l2, c8844l);
                        if (objLoadAd == enumC9342l) {
                            return enumC9342l;
                        }
                        c13218l2 = c13218l;
                        str = (String) objLoadAd;
                        if (str == null) {
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 6;
                            objCrashlytics = c13218l2.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (str.length() > 0) {
                            C9477l c9477lYandex3 = C7819l.yandex(c13218l2.amazon);
                            c9477lYandex3.crashlytics = str;
                            C13218l c13218lAmazon4 = c13218l2.amazon(c9477lYandex3.yandex());
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 3;
                            objCrashlytics = c13218lAmazon4.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (AbstractC8576l.yandex(c13218l2.amazon.Signature.yandex.get(C12014l.f23938l), Boolean.TRUE)) {
                            C9477l c9477lYandex4 = C7819l.yandex(c13218l2.amazon);
                            c9477lYandex4.crashlytics = new Integer(R.drawable.generic_audio_nowplaying);
                            C13218l c13218lAmazon5 = c13218l2.amazon(c9477lYandex4.yandex());
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 4;
                            objCrashlytics = c13218lAmazon5.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            C13218l c13218lAmazon6 = c13218l2.amazon(c13218l2.amazon);
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 5;
                            objCrashlytics = c13218lAmazon6.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return objCrashlytics;
                    case 2:
                        c13218l2 = c8844l.f18179l;
                        AbstractC2829l.crashlytics(objLoadAd);
                        str = (String) objLoadAd;
                        if (str == null) {
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 6;
                            objCrashlytics = c13218l2.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (str.length() > 0) {
                            C9477l c9477lYandex5 = C7819l.yandex(c13218l2.amazon);
                            c9477lYandex5.crashlytics = str;
                            C13218l c13218lAmazon7 = c13218l2.amazon(c9477lYandex5.yandex());
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 3;
                            objCrashlytics = c13218lAmazon7.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else if (AbstractC8576l.yandex(c13218l2.amazon.Signature.yandex.get(C12014l.f23938l), Boolean.TRUE)) {
                            C9477l c9477lYandex6 = C7819l.yandex(c13218l2.amazon);
                            c9477lYandex6.crashlytics = new Integer(R.drawable.generic_audio_nowplaying);
                            C13218l c13218lAmazon8 = c13218l2.amazon(c9477lYandex6.yandex());
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 4;
                            objCrashlytics = c13218lAmazon8.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            C13218l c13218lAmazon9 = c13218l2.amazon(c13218l2.amazon);
                            c8844l.f18179l = null;
                            c8844l.f18178l = null;
                            c8844l.f18180l = 5;
                            objCrashlytics = c13218lAmazon9.crashlytics(c8844l);
                            if (objCrashlytics == enumC9342l) {
                                return enumC9342l;
                            }
                        }
                        return objCrashlytics;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        AbstractC2829l.crashlytics(objLoadAd);
                        return objLoadAd;
                    default:
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            case 1:
                if (interfaceC14029l instanceof C12608l) {
                    c12608l = (C12608l) interfaceC14029l;
                    int i3 = c12608l.f24831l;
                    if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c12608l.f24831l = i3 - RecyclerView.UNDEFINED_DURATION;
                    } else {
                        c12608l = new C12608l(this, (AbstractC0283l) interfaceC14029l);
                    }
                } else {
                    c12608l = new C12608l(this, (AbstractC0283l) interfaceC14029l);
                }
                Object objCrashlytics3 = c12608l.f24832l;
                int i4 = c12608l.f24831l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(objCrashlytics3);
                    Object obj2 = c13218l.amazon.loadAd;
                    AudioPlaylist audioPlaylist = obj2 instanceof AudioPlaylist ? (AudioPlaylist) obj2 : null;
                    c12608l.f24833l = c13218l;
                    c12608l.f24831l = 1;
                    objCrashlytics3 = crashlytics(audioPlaylist, c12608l);
                    if (objCrashlytics3 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2 || i4 == 3) {
                            AbstractC2829l.crashlytics(objCrashlytics3);
                            return objCrashlytics3;
                        }
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c13218l = c12608l.f24833l;
                    AbstractC2829l.crashlytics(objCrashlytics3);
                }
                String str2 = (String) objCrashlytics3;
                if (str2 != null) {
                    C9477l c9477lYandex7 = C7819l.yandex(c13218l.amazon);
                    c9477lYandex7.crashlytics = str2;
                    C13218l c13218lAmazon10 = c13218l.amazon(c9477lYandex7.yandex());
                    c12608l.f24833l = null;
                    c12608l.f24831l = 2;
                    objCrashlytics2 = c13218lAmazon10.crashlytics(c12608l);
                    if (objCrashlytics2 == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    c12608l.f24833l = null;
                    c12608l.f24831l = 3;
                    objCrashlytics2 = c13218l.crashlytics(c12608l);
                    if (objCrashlytics2 == enumC9342l) {
                        return enumC9342l;
                    }
                }
                return objCrashlytics2;
            default:
                C7819l c7819l2 = c13218l.amazon;
                Object obj3 = c7819l2.loadAd;
                AudioTrack audioTrack3 = obj3 instanceof AudioTrack ? (AudioTrack) obj3 : null;
                if (audioTrack3 != null) {
                    String strMopub = AbstractC16676l.mopub(audioTrack3);
                    C5198l c5198lM3161l = C6336l.loadAd.m3161l();
                    CachedTrack cachedTrack = c5198lM3161l != null ? (CachedTrack) AbstractC11356l.loadAd(c5198lM3161l.m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{strMopub}, 1))) : null;
                    if (cachedTrack != null && (strPremium = cachedTrack.premium()) != null) {
                        CachedAlbum cachedAlbumYandex = cachedTrack.yandex();
                        String strRemoteconfig = cachedAlbumYandex != null ? cachedAlbumYandex.remoteconfig() : null;
                        if (cachedTrack.appmetrica()) {
                            if (cachedTrack.applovin()) {
                                c14025lAdmob = AbstractC0825l.admob(3, strPremium);
                            } else if (cachedTrack.m4646strictfp()) {
                                c14025lAdmob = AbstractC0825l.admob(2, strPremium);
                            } else {
                                c14025lAdmob = strRemoteconfig != null ? AbstractC0825l.admob(4, strRemoteconfig) : null;
                            }
                            if (c14025lAdmob != null) {
                                strTapsense = c14025lAdmob.f27331l.tapsense();
                            }
                        }
                    }
                }
                if (strTapsense == null) {
                    return c13218l.crashlytics((AbstractC0283l) interfaceC14029l);
                }
                C9477l c9477lYandex8 = C7819l.yandex(c7819l2);
                c9477lYandex8.crashlytics = strTapsense;
                return c13218l.amazon(c9477lYandex8.yandex()).crashlytics((AbstractC0283l) interfaceC14029l);
        }
    }
}
