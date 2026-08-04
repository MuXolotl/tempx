package defpackage;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import io.realm.kotlin.internal.RealmInitializer;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedEmbeddedThumb;
import ua.itaysonlab.vkxreborn.cache.realm.CachedLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPhotoSize;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyrics;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrackLyricsSynchronizedLine;
import ua.itaysonlab.vkxreborn.cache.realm.CachedVkGenre;
import ua.itaysonlab.vkxreborn.cache.realm.NewCachedPodcastInfo;

/* JADX INFO: renamed from: lًؙۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6336l {
    public static final C11644l loadAd;
    public static final C6336l yandex;

    static {
        C6336l c6336l = new C6336l();
        yandex = c6336l;
        C15499l c15499lLoadAd = c6336l.loadAd();
        c15499lLoadAd.loadAd("vkx_main");
        C12125l c12125lYandex = c15499lLoadAd.yandex();
        VKXApplication vKXApplication = VKXApplication.f36631l;
        InterfaceC14029l interfaceC14029l = null;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        int i = 1;
        loadAd = new C11644l(c12125lYandex, vKXApplication, new C2063l(i, interfaceC14029l, 0), new C2063l(i, interfaceC14029l, i));
    }

    public static void amazon(C9529l c9529l, long j, Function1 function1) {
        long ptr$cinterop_release = ((LongPointerWrapper) c9529l.yandex.remoteconfig().mo1845l()).getPtr$cinterop_release();
        int i = AbstractC9795l.yandex;
        if (j > realmcJNI.realm_get_schema_version(ptr$cinterop_release)) {
            function1.invoke(c9529l);
        }
    }

    public static Object billing(Function1 function1, AbstractC0283l abstractC0283l) {
        return AbstractC10999l.firebase(AbstractC11463l.yandex, new C15556l(function1, null, 16), abstractC0283l);
    }

    public static Object mopub(Function1 function1, InterfaceC14029l interfaceC14029l) {
        return AbstractC10999l.firebase(AbstractC11463l.yandex, new C3289l(4, null, function1), interfaceC14029l);
    }

    public final void crashlytics() {
        if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper())) {
            AbstractC2991l.billing(AbstractC17265l.yandex(this), 5, "Realm functions should be offloaded to a non-main thread", null);
        }
    }

    public final C15499l loadAd() {
        InterfaceC1388l interfaceC1388l;
        C2336l c2336l = AbstractC18202l.yandex;
        Set setM2407import = AbstractC8669l.m2407import(new InterfaceC1388l[]{c2336l.loadAd(CachedAlbum.class), c2336l.loadAd(CachedArtist.class), c2336l.loadAd(CachedVkGenre.class), c2336l.loadAd(CachedLibrary.class), c2336l.loadAd(CachedPhotoSize.class), c2336l.loadAd(NewCachedPodcastInfo.class), c2336l.loadAd(CachedEmbeddedThumb.class), c2336l.loadAd(CachedTrack.class), c2336l.loadAd(CachedTrackLyricsSynchronizedLine.class), c2336l.loadAd(CachedTrackLyrics.class), c2336l.loadAd(CachedPlaylist.class), c2336l.loadAd(XTrackLyrics.class), c2336l.loadAd(CachedPlaylistLibrary.class)});
        C15499l c15499l = new C15499l();
        c15499l.yandex = setM2407import;
        Iterator it = setM2407import.iterator();
        do {
            if (!it.hasNext()) {
                c15499l.loadAd = Long.MAX_VALUE;
                c15499l.amazon = "default.realm";
                File file = RealmInitializer.yandex;
                c15499l.purchase = (file != null ? file : null).getAbsolutePath();
                c15499l.crashlytics = 9L;
                c15499l.billing = new C15452l(this);
                return c15499l;
            }
            interfaceC1388l = (InterfaceC1388l) it.next();
        } while (AbstractC5293l.yandex(interfaceC1388l) != null);
        C8339l.metrica(AbstractC14814l.ads("Only subclasses of RealmObject and EmbeddedRealmObject are allowed in the schema. Found: ", interfaceC1388l.billing(), ". If ", interfaceC1388l.billing(), " is a valid subclass: This class has not been modified by the Realm Compiler Plugin. Has the Realm Gradle Plugin been applied to the project with this model class?"));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (((defpackage.C5198l) r4).m1734l(r5, r0) == r3) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object purchase(defpackage.AbstractC0283l r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C1451l
            if (r0 == 0) goto L13
            r0 = r5
            lْؒۤ r0 = (defpackage.C1451l) r0
            int r1 = r0.f3639l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3639l = r1
            goto L18
        L13:
            lْؒۤ r0 = new lْؒۤ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.f3638l
            int r5 = r0.f3639l
            r1 = 2
            r2 = 1
            lٍؗؐ r3 = defpackage.EnumC9342l.f19165l
            if (r5 == 0) goto L35
            if (r5 == r2) goto L31
            if (r5 != r1) goto L2a
            defpackage.AbstractC2829l.crashlytics(r4)
            goto L55
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r4)
            r4 = 0
            return r4
        L31:
            defpackage.AbstractC2829l.crashlytics(r4)
            goto L43
        L35:
            defpackage.AbstractC2829l.crashlytics(r4)
            r0.f3639l = r2
            lُِؗ r4 = defpackage.C6336l.loadAd
            java.lang.Object r4 = r4.m3168l(r0)
            if (r4 != r3) goto L43
            goto L54
        L43:
            lَؗ۠ r4 = (defpackage.C5198l) r4
            lٌؗٗ r5 = new lٌؗٗ
            r2 = 20
            r5.<init>(r2)
            r0.f3639l = r1
            java.lang.Object r4 = r4.m1734l(r5, r0)
            if (r4 != r3) goto L55
        L54:
            return r3
        L55:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6336l.purchase(lّؑۧ):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable yandex(AbstractC0283l abstractC0283l) {
        C13364l c13364l;
        C14025l c14025lPurchase;
        if (abstractC0283l instanceof C13364l) {
            c13364l = (C13364l) abstractC0283l;
            int i = c13364l.f26219l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13364l.f26219l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13364l = new C13364l(this, abstractC0283l);
            }
        } else {
            c13364l = new C13364l(this, abstractC0283l);
        }
        Object objM3168l = c13364l.f26220l;
        int i2 = c13364l.f26219l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objM3168l);
            String str = C14025l.f27330l;
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            c14025lPurchase = C6162l.ads(vKXApplication.getFilesDir()).purchase("vkx_main_cdcm");
            AbstractC5921l.f12465l.adcel(c14025lPurchase, false);
            c13364l.f26221l = c14025lPurchase;
            c13364l.f26219l = 1;
            objM3168l = loadAd.m3168l(c13364l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objM3168l == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14025lPurchase = c13364l.f26221l;
            AbstractC2829l.crashlytics(objM3168l);
        }
        C5198l c5198l = (C5198l) objM3168l;
        C15499l c15499lLoadAd = yandex.loadAd();
        c15499lLoadAd.loadAd("vkx_main_cdcm");
        C12125l c12125lYandex = c15499lLoadAd.yandex();
        c5198l.getClass();
        String str2 = c12125lYandex.crashlytics;
        File file = new File(str2);
        if (file.exists() && file.isFile()) {
            C8339l.metrica(AbstractC15560l.Signature("File already exists at: ", str2, ". Realm can only write a copy to an empty path."));
            return null;
        }
        NativePointer nativePointerYandex = c12125lYandex.yandex();
        long ptr$cinterop_release = ((LongPointerWrapper) c5198l.remoteconfig().f12151l).getPtr$cinterop_release();
        long ptr$cinterop_release2 = ((LongPointerWrapper) nativePointerYandex).getPtr$cinterop_release();
        int i3 = AbstractC9795l.yandex;
        realmcJNI.realm_convert_with_config(ptr$cinterop_release, ptr$cinterop_release2, false);
        return c14025lPurchase;
    }
}
