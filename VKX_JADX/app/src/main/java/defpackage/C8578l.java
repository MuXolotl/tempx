package defpackage;

import android.content.Context;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.loadAd;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* JADX INFO: renamed from: lٌؗٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8578l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17693l;

    public /* synthetic */ C8578l(int i) {
        this.f17693l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C3971l c3971l;
        int i = this.f17693l;
        int i2 = 10;
        int i3 = 6;
        C2580l c2580l = C2580l.f5619l;
        int i4 = 3;
        int i5 = 0;
        InterfaceC14029l interfaceC14029l = null;
        int i6 = 1;
        switch (i) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case 2:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case 3:
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC6159l.loadAd, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC6159l.crashlytics, 3);
                AbstractC1757l.appmetrica(c1336l, null, null, AbstractC6159l.amazon, 3);
                return Unit.INSTANCE;
            case 4:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case 5:
                CachedPlaylistLibrary cachedPlaylistLibrary = (CachedPlaylistLibrary) ((C3918l) obj).m1449l(AbstractC18202l.yandex.loadAd(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).purchase().yandex();
                if (cachedPlaylistLibrary != null) {
                    InterfaceC11334l interfaceC11334lYandex = cachedPlaylistLibrary.yandex();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : interfaceC11334lYandex) {
                        if (hashSet.add(((CachedPlaylist) obj2).m4618throws())) {
                            arrayList.add(obj2);
                        }
                    }
                    cachedPlaylistLibrary.crashlytics(AbstractC13702l.mopub(arrayList));
                }
                return Unit.INSTANCE;
            case 6:
                C15825l c15825lCrashlytics = ((C5198l) obj).m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).crashlytics();
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(c15825lCrashlytics, 10));
                Iterator it = c15825lCrashlytics.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((CachedTrack) it.next()).crashlytics());
                }
                return arrayList2;
            case 7:
                long[] jArr = new long[1];
                long ptr$cinterop_release = ((LongPointerWrapper) ((NativePointer) ((C5198l) obj).m1735l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).yandex().f35846l)).getPtr$cinterop_release();
                int i7 = AbstractC9795l.yandex;
                realmcJNI.realm_query_count(ptr$cinterop_release, jArr);
                return Long.valueOf(jArr[0]);
            case 8:
                return (C13939l) ((AbstractC11904l) C7196l.f15029l.f33214l);
            case 9:
                InterfaceC13922l[] interfaceC13922lArr = AbstractC2639l.yandex;
                return c2580l;
            case 10:
                return (C7814l) ((AbstractC11904l) C3078l.f6613l.f33214l);
            case 11:
                return Collections.singletonList(C14068l.yandex);
            case 12:
                return (C3278l) ((AbstractC11904l) C0995l.f2741l.f33214l);
            case 13:
                InterfaceC13922l[] interfaceC13922lArr2 = AbstractC15925l.yandex;
                return c2580l;
            case 14:
                return (C18554l) ((AbstractC11904l) C8993l.f18539l.f33214l);
            case 15:
                return Collections.singletonList(new C14042l(new C9871l((Context) obj, i3), AbstractC8669l.m2407import(new String[]{"interface_mpswipe", "swipe_nowplaying", "interface_roundednp", "np_slide_hide_systembars", "now_playing_controller", "interface_nowplayingstyle"}), new C13749l(i4, interfaceC14029l, i2), 4));
            case 16:
                return (C4700l) ((AbstractC11904l) C7445l.f15420l.f33214l);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC13922l[] interfaceC13922lArr3 = AbstractC12091l.yandex;
                return c2580l;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return (C15343l) ((AbstractC11904l) C6546l.f13666l.f33214l);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Context context = (Context) obj;
                return AbstractC14055l.remoteconfig(new C14042l(new C9871l(context, 9), AbstractC8669l.m2407import(new String[]{"theming_last_theme_light", "theming_last_theme_dark", "interface_accent", "interface_theme"}), new C10769l(i4, interfaceC14029l, i5), 4), new C14042l(new C9871l(context, 7), AbstractC8669l.m2407import(new String[]{"theming_system", "a12_monet", "ct_override"}), new C10769l(i4, interfaceC14029l, i6), 4), new C14042l(new C9871l(context, 8), null, new C10769l(i4, interfaceC14029l, 2), 6));
            case 20:
                C3918l c3918l = (C3918l) obj;
                NativePointer nativePointer = ((C6067l) c3918l.remoteconfig()).f12835l;
                C11513l c11513lMo1847l = ((C6067l) c3918l.remoteconfig()).mo1847l();
                ArrayList arrayListCrashlytics = loadAd.crashlytics(nativePointer);
                ArrayList<C3971l> arrayList3 = new ArrayList();
                Iterator it2 = arrayListCrashlytics.iterator();
                while (it2.hasNext()) {
                    long j = ((C6918l) it2.next()).yandex;
                    C7507l c7507lLoadAd = loadAd.loadAd(nativePointer, j);
                    C2330l c2330lYandex = c11513lMo1847l.yandex(c7507lLoadAd.yandex);
                    if (c2330lYandex == null || c2330lYandex.subs == null) {
                        c3971l = null;
                    } else {
                        List listAmazon = loadAd.amazon(nativePointer, j, c7507lLoadAd.crashlytics + c7507lLoadAd.amazon);
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : listAmazon) {
                            C0717l c0717l = (C0717l) c2330lYandex.purchase.get(((C11085l) obj3).yandex);
                            if (c0717l != null && c0717l.yandex != null) {
                                arrayList4.add(obj3);
                            }
                        }
                        c3971l = new C3971l(c7507lLoadAd, arrayList4);
                    }
                    if (c3971l != null) {
                        arrayList3.add(c3971l);
                    }
                }
                for (C3971l c3971l2 : arrayList3) {
                    C2330l c2330lYandex2 = c3918l.remoteconfig().mo1847l().yandex(c3971l2.crashlytics);
                    InterfaceC1388l interfaceC1388l = c2330lYandex2 != null ? c2330lYandex2.subs : null;
                    if (interfaceC1388l == null) {
                        C8339l.smaato("Could not delete: ".concat(c3971l2.crashlytics));
                        return null;
                    }
                    c3918l.m1448l(interfaceC1388l);
                }
                return Unit.INSTANCE;
            case 21:
                return Boolean.TRUE;
            case 22:
                return Collections.singletonList(C8505l.INSTANCE);
            case 23:
                return Collections.singletonList(C8505l.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Collections.singletonList(C4526l.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Collections.singletonList(C17720l.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Collections.singletonList(C17720l.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Collections.singletonList(C18130l.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Collections.singletonList(C8505l.INSTANCE);
            default:
                return Collections.singletonList(C17720l.INSTANCE);
        }
    }
}
