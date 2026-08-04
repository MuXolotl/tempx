package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Build;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ReplacementOption;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.FollowedMetadata;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.OriginalPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedArtist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedEmbeddedThumb;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylistLibrary;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedVkGenre;

/* JADX INFO: renamed from: lۣؔۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3005l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f6510l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f6511l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6512l;

    public /* synthetic */ C3005l(Object obj, Object obj2, int i) {
        this.f6512l = i;
        this.f6511l = obj;
        this.f6510l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x031c  */
    /* JADX WARN: Code duplicated, block: B:118:0x032d  */
    /* JADX WARN: Code duplicated, block: B:120:0x033c  */
    /* JADX WARN: Code duplicated, block: B:143:0x038b  */
    /* JADX WARN: Code duplicated, block: B:146:0x039c  */
    /* JADX WARN: Code duplicated, block: B:148:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:171:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:174:0x040c  */
    /* JADX WARN: Code duplicated, block: B:176:0x041b  */
    /* JADX WARN: Code duplicated, block: B:180:0x0427  */
    /* JADX WARN: Code duplicated, block: B:182:0x0432  */
    /* JADX WARN: Code duplicated, block: B:187:0x0447  */
    /* JADX WARN: Code duplicated, block: B:189:0x044f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0451  */
    /* JADX WARN: Code duplicated, block: B:192:0x0459  */
    /* JADX WARN: Code duplicated, block: B:193:0x045b  */
    /* JADX WARN: Code duplicated, block: B:195:0x0461  */
    /* JADX WARN: Code duplicated, block: B:196:0x0463  */
    /* JADX WARN: Code duplicated, block: B:198:0x046b  */
    /* JADX WARN: Code duplicated, block: B:203:0x0474  */
    /* JADX WARN: Code duplicated, block: B:206:0x0485  */
    /* JADX WARN: Code duplicated, block: B:208:0x0494  */
    /* JADX WARN: Code duplicated, block: B:261:0x0592  */
    /* JADX WARN: Code duplicated, block: B:262:0x0594  */
    /* JADX WARN: Code duplicated, block: B:419:0x033f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:428:0x03ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x041e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0497 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Boolean bool;
        String str;
        C8195l c8195l;
        Object c2451l;
        Object objInvoke;
        Object objInvoke2;
        int size;
        int i;
        C6886l c6886l;
        int size2;
        int i2;
        C6886l c6886l2;
        C6886l c6886l3;
        ArrayList arrayList;
        int size3;
        int i3;
        Object obj2;
        C6886l c6886l4;
        int i4;
        Object obj3;
        int size4;
        int i5;
        Object obj4;
        int size5;
        int i6;
        Object obj5;
        Typeface typefaceLoadAd;
        C8902l c8902l;
        final int i7 = 8;
        int i8 = 21;
        int i9 = 29;
        final int i10 = 2;
        final int i11 = 7;
        final int i12 = 10;
        InterfaceC14029l interfaceC14029l = null;
        int i13 = 3;
        int i14 = 1;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        switch (this.f6512l) {
            case 0:
                InterfaceC17842l interfaceC17842l = (InterfaceC17842l) this.f6511l;
                String str2 = (String) this.f6510l;
                Function0 function0 = (Function0) obj;
                C6921l c6921lCrashlytics = interfaceC17842l.crashlytics();
                InterfaceC0896l interfaceC0896l = (InterfaceC0896l) ((HashMap) c6921lCrashlytics.f14493l).get(str2);
                if (interfaceC0896l != null) {
                    return interfaceC0896l;
                }
                InterfaceC0896l interfaceC0896l2 = (InterfaceC0896l) function0.invoke();
                c6921lCrashlytics.ad(str2, interfaceC0896l2);
                return interfaceC0896l2;
            case 1:
                InterfaceC9764l interfaceC9764l = (InterfaceC9764l) this.f6511l;
                C9879l c9879l = (C9879l) this.f6510l;
                AbstractC18643l abstractC18643l = (AbstractC18643l) obj;
                C16076l c16076l = VKXApplication.f36632l;
                if (c16076l == null) {
                    c16076l = null;
                }
                C10507l c10507lCrashlytics = c16076l.crashlytics();
                if (AbstractC8576l.yandex(c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null, abstractC18643l)) {
                    C16076l c16076l2 = VKXApplication.f36632l;
                    if (c16076l2 == null) {
                        c16076l2 = null;
                    }
                    c16076l2.getClass();
                    bool = null;
                    c16076l2.subs(new C9239l((Object) c16076l2, (boolean) (b2 == true ? 1 : 0), (InterfaceC14029l) (0 == true ? 1 : 0), (int) (b == true ? 1 : 0)));
                } else {
                    interfaceC9764l.crashlytics(false);
                    bool = null;
                }
                c9879l.metrica(C14267l.yandex(c9879l.firebase(), C14974l.yandex(c9879l.firebase().yandex, Boolean.FALSE, bool, 95), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                return Unit.INSTANCE;
            case 2:
                AbstractC18082l abstractC18082l = (AbstractC18082l) this.f6511l;
                C15578l c15578l = (C15578l) this.f6510l;
                int i15 = C9233l.f18988l;
                ((C1336l) obj).firebase(abstractC18082l.pro(), new Creturn(20, abstractC18082l), new Creturn(abstractC18082l, 21, false), new C15578l(802480018, true, new C6780l(abstractC18082l, c15578l, i11)));
                return Unit.INSTANCE;
            case 3:
                C17812l c17812l = (C17812l) this.f6511l;
                AbstractC9544l abstractC9544l = (AbstractC9544l) this.f6510l;
                C6742l c6742l = (C6742l) obj;
                c6742l.yandex();
                if (((Boolean) c17812l.subscription.getValue()).booleanValue() || ((Boolean) c17812l.tapsense.getValue()).booleanValue()) {
                    AbstractC9361l.vip(c6742l, abstractC9544l, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.INSTANCE;
            case 4:
                C5807l c5807l = (C5807l) this.f6511l;
                C9426l c9426l = (C9426l) this.f6510l;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    c5807l.loadAd(c9426l.m3884native());
                } else if (th instanceof CancellationException) {
                    c5807l.crashlytics();
                } else {
                    c5807l.amazon(th);
                }
                return Unit.INSTANCE;
            case 5:
                List list = (List) this.f6511l;
                Function1 function1 = (Function1) this.f6510l;
                C5348l c5348l = C5348l.f11490l;
                ((C13964l) obj).isPro(list.size(), new Creturn(23, list), new Creturn(list, 24, false), new C15578l(-1117249557, true, new C4232l(list, function1, 1)));
                return Unit.INSTANCE;
            case 6:
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f6511l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f6510l;
                ((Boolean) obj).getClass();
                AbstractC10999l.mopub(interfaceC2262l, null, 0, new C16802l(interfaceC8714l, interfaceC14029l, i14), 3);
                return Unit.INSTANCE;
            case 7:
                final C1050l c1050l = (C1050l) this.f6511l;
                final InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f6510l;
                C1336l c1336l = (C1336l) obj;
                final int i16 = 1;
                final int i17 = 3;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1341751794, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i18 = i12;
                        final int i19 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i20 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i18) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i21 = i20;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i21) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i21 = i19;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i21) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i21 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(477498075, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i18 = i17;
                        final int i19 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i20 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i18) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i20;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i19;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i21 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i18 = 4;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1937942598, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i19 = i18;
                        final int i110 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i20 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i19) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i20;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i110;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i21 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final byte b8 = b4 == true ? 1 : 0;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-58415975, true, new Function3() { // from class: lؒۥؒ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i19 = b8;
                        Object obj9 = C1867l.yandex;
                        InterfaceC2262l interfaceC2262l3 = interfaceC2262l2;
                        C1050l c1050l2 = c1050l;
                        C6956l c6956l = (C6956l) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i19) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(interfaceC2262l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == obj9) {
                                        objM2132native = new C12454l(interfaceC2262l3, 0);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    c1050l2.m777abstract("Captcha", (Function0) objM2132native, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(interfaceC2262l3) | c6956l.admob(c1050l2);
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native2 == obj9) {
                                        objM2132native2 = new C12242l(interfaceC2262l3, c1050l2, 11);
                                        c6956l.m2147try(objM2132native2);
                                    }
                                    c1050l2.m777abstract("Show OTA info", (Function0) objM2132native2, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i19 = 5;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1821110648, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i19;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i20 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i20;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i21 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i20 = 6;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-594330025, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i20;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i21 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i22 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i22) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i22 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i22;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1285196598, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i11;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i21 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i22 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i22;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1130244075, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i7;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i21 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i21;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i22 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i22;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(749282548, true, new Function3() { // from class: lؒۥؒ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i110 = i16;
                        Object obj9 = C1867l.yandex;
                        InterfaceC2262l interfaceC2262l3 = interfaceC2262l2;
                        C1050l c1050l2 = c1050l;
                        C6956l c6956l = (C6956l) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i110) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(interfaceC2262l3);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == obj9) {
                                        objM2132native = new C12454l(interfaceC2262l3, 0);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    c1050l2.m777abstract("Captcha", (Function0) objM2132native, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(interfaceC2262l3) | c6956l.admob(c1050l2);
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native2 == obj9) {
                                        objM2132native2 = new C12242l(interfaceC2262l3, c1050l2, 11);
                                        c6956l.m2147try(objM2132native2);
                                    }
                                    c1050l2.m777abstract("Show OTA info", (Function0) objM2132native2, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i21 = 9;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1666158125, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i21;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i22 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i22;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i23 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i23) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i23 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i24 = i23;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i24) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i22 = 11;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-1465186471, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i22;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i23 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i24 = i23;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i24) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i24 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i24) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i24 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i25 = i24;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i25) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final int i23 = 12;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(414340152, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i23;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i24 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i25 = i24;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i25) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i25 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i25) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i25 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i25;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                final byte b9 = b3 == true ? 1 : 0;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-2001100521, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = b9;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i24 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i24;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i25 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i25;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(-121573898, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i16;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i24 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i24;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i25 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i25;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1757952725, true, new Function3() { // from class: lؚؖٝ
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        Object obj9;
                        Object obj10;
                        Object obj11;
                        Object obj12;
                        Object obj13;
                        Object obj14;
                        Object obj15;
                        Object obj16;
                        Object obj17;
                        int i110 = i10;
                        final int i111 = 2;
                        Object obj18 = C1867l.yandex;
                        final C1050l c1050l2 = c1050l;
                        boolean z = false;
                        final int i24 = 1;
                        Object obj19 = (C7091l) obj6;
                        C6956l c6956l = (C6956l) obj7;
                        Integer num = (Integer) obj8;
                        switch (i110) {
                            case 0:
                                int iIntValue = num.intValue();
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c1050l2.m778import("User", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                int iIntValue2 = num.intValue();
                                if (c6956l.m2127for(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objM2132native = c6956l.m2132native();
                                    if (objM2132native == obj18) {
                                        obj9 = objM2132native;
                                        Object c3321l = new C3321l(10);
                                        c6956l.m2147try(c3321l);
                                        obj9 = c3321l;
                                    }
                                    obj9 = objM2132native;
                                    c1050l2.m777abstract("Copy user_id", (Function0) obj9, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 2:
                                int iIntValue3 = num.intValue();
                                if (c6956l.m2127for(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                    Object objM2132native2 = c6956l.m2132native();
                                    if (objM2132native2 == obj18) {
                                        obj10 = objM2132native2;
                                        Object c3321l2 = new C3321l(8);
                                        c6956l.m2147try(c3321l2);
                                        obj10 = c3321l2;
                                    }
                                    obj10 = objM2132native2;
                                    c1050l2.m777abstract("Copy access_token", (Function0) obj10, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 3:
                                int iIntValue4 = num.intValue();
                                if (c6956l.m2127for(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                    c1050l2.m778import("Testing", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 4:
                                int iIntValue5 = num.intValue();
                                if ((iIntValue5 & 6) == 0) {
                                    iIntValue5 |= c6956l.billing(obj19) ? 4 : 2;
                                }
                                if (c6956l.m2127for(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                                    boolean z2 = (iIntValue5 & 14) == 4;
                                    Object objM2132native3 = c6956l.m2132native();
                                    Object obj20 = objM2132native3;
                                    if (z2 || objM2132native3 == obj18) {
                                        Object c3321l3 = new C3321l(9);
                                        c6956l.m2147try(c3321l3);
                                        obj20 = c3321l3;
                                    }
                                    c1050l2.m777abstract("EqDump", (Function0) obj20, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 5:
                                int iIntValue6 = num.intValue();
                                if (c6956l.m2127for(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c1050l2);
                                    Object objM2132native4 = c6956l.m2132native();
                                    if (zAdmob || objM2132native4 == obj18) {
                                        obj11 = objM2132native4;
                                        Object obj21 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i24;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj21);
                                        obj11 = obj21;
                                    }
                                    c1050l2.m777abstract("Toggles", (Function0) obj11, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 6:
                                int iIntValue7 = num.intValue();
                                if (c6956l.m2127for(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                    Object objM2132native5 = c6956l.m2132native();
                                    if (objM2132native5 == obj18) {
                                        obj12 = objM2132native5;
                                        Object c3321l4 = new C3321l(6);
                                        c6956l.m2147try(c3321l4);
                                        obj12 = c3321l4;
                                    }
                                    obj12 = objM2132native5;
                                    c1050l2.m777abstract("Clear UI hints", (Function0) obj12, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 7:
                                int iIntValue8 = num.intValue();
                                if (c6956l.m2127for(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                    boolean zAdmob2 = c6956l.admob(c1050l2);
                                    Object objM2132native6 = c6956l.m2132native();
                                    if (zAdmob2 || objM2132native6 == obj18) {
                                        obj13 = objM2132native6;
                                        Object obj22 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i111;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj22);
                                        obj13 = obj22;
                                    }
                                    c1050l2.m777abstract("Check for VPN connection", (Function0) obj13, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 8:
                                int iIntValue9 = num.intValue();
                                if (c6956l.m2127for(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                    boolean zAdmob3 = c6956l.admob(c1050l2);
                                    Object objM2132native7 = c6956l.m2132native();
                                    if (zAdmob3 || objM2132native7 == obj18) {
                                        obj14 = objM2132native7;
                                        final int i25 = z ? 1 : 0;
                                        Object obj23 = new Function0() { // from class: lؙؖۡ
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                int i26 = i25;
                                                C1050l c1050l3 = c1050l2;
                                                switch (i26) {
                                                    case 0:
                                                        AbstractC12832l.mopub(new C3850l(), AbstractC11990l.firebase(c1050l3));
                                                        break;
                                                    case 1:
                                                        c1050l3.m4125private(new C16852l(0));
                                                        break;
                                                    default:
                                                        AppActivity appActivity = (AppActivity) c1050l3.isVip();
                                                        StringBuilder sb = new StringBuilder("Is using VPN: ");
                                                        ConnectivityManager connectivityManager = VKXApplication.f36630l;
                                                        if (connectivityManager == null) {
                                                            connectivityManager = null;
                                                        }
                                                        sb.append(AbstractC13950l.m3811for(connectivityManager));
                                                        C6666l.yandex(appActivity, new C10734l(null, sb.toString(), null, null, null, 253));
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        c6956l.m2147try(obj23);
                                        obj14 = obj23;
                                    }
                                    c1050l2.m777abstract("Simulate headset connection", (Function0) obj14, c6956l, 518);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 9:
                                int iIntValue10 = num.intValue();
                                if (c6956l.m2127for(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                    c1050l2.m778import("OcReports", c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 10:
                                int iIntValue11 = num.intValue();
                                if (c6956l.m2127for(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                                    Object objM2132native8 = c6956l.m2132native();
                                    if (objM2132native8 == obj18) {
                                        obj15 = objM2132native8;
                                        Object obj24 = Build.MANUFACTURER + ' ' + Build.MODEL + " (" + Build.DEVICE + ")\n" + Build.VERSION.SDK_INT + ' ' + Build.VERSION.CODENAME + "\nua.itaysonlab.vkx 8.14.1_pub [100136]";
                                        c6956l.m2147try(obj24);
                                        obj15 = obj24;
                                    }
                                    obj15 = objM2132native8;
                                    c1050l2.m778import((String) obj15, c6956l, 70);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 11:
                                int iIntValue12 = num.intValue();
                                if (c6956l.m2127for(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                    Object objM2132native9 = c6956l.m2132native();
                                    if (objM2132native9 == obj18) {
                                        obj16 = objM2132native9;
                                        Object c3321l5 = new C3321l(11);
                                        c6956l.m2147try(c3321l5);
                                        obj16 = c3321l5;
                                    }
                                    obj16 = objM2132native9;
                                    c1050l2.m777abstract("Test Crash", (Function0) obj16, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                int iIntValue13 = num.intValue();
                                if (c6956l.m2127for(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                    Object objM2132native10 = c6956l.m2132native();
                                    if (objM2132native10 == obj18) {
                                        obj17 = objM2132native10;
                                        Object c3321l6 = new C3321l(7);
                                        c6956l.m2147try(c3321l6);
                                        obj17 = c3321l6;
                                    }
                                    obj17 = objM2132native10;
                                    c1050l2.m777abstract("Test NonCritical", (Function0) obj17, c6956l, 566);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                return Unit.INSTANCE;
            case 8:
                InterfaceC11075l interfaceC11075l = (InterfaceC11075l) this.f6511l;
                C17685l c17685l = (C17685l) this.f6510l;
                C3918l c3918l = (C3918l) obj;
                List listAdcel = AbstractC17587l.adcel(new C11100l(interfaceC11075l, C0451l.f1632l));
                List listM4243this = AbstractC16901l.m4243this(c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedTrack.class), "uid IN $0", Arrays.copyOf(new Object[]{listAdcel}, 1)).crashlytics(), new C15705l(b5 == true ? 1 : 0, listAdcel));
                AudioPlaylist audioPlaylist = c17685l.purchase;
                FollowedMetadata followedMetadata = audioPlaylist.subscription;
                OriginalPlaylist originalPlaylist = audioPlaylist.tapsense;
                CachedPlaylist cachedPlaylist = new CachedPlaylist();
                cachedPlaylist.m4595default(audioPlaylist.crashlytics);
                cachedPlaylist.m4589abstract(audioPlaylist.amazon);
                cachedPlaylist.m4590break(AbstractC14770l.vip(audioPlaylist));
                cachedPlaylist.m4597extends(audioPlaylist.pro);
                String str3 = audioPlaylist.mopub;
                cachedPlaylist.m4620try(str3);
                cachedPlaylist.m4606new(str3.toLowerCase(Locale.ROOT));
                cachedPlaylist.m4591case(audioPlaylist.admob);
                cachedPlaylist.m4592catch(audioPlaylist.subs);
                cachedPlaylist.m4604interface(audioPlaylist.isPro);
                cachedPlaylist.m4599finally(audioPlaylist.firebase);
                Boolean bool2 = audioPlaylist.metrica;
                cachedPlaylist.m4611static(bool2 != null ? bool2.booleanValue() : false);
                cachedPlaylist.m4609protected(audioPlaylist.ads);
                AlbumThumb albumThumb = audioPlaylist.Signature;
                cachedPlaylist.m4610public(albumThumb != null ? new CachedEmbeddedThumb(albumThumb) : null);
                cachedPlaylist.m4603instanceof(audioPlaylist.f36621strictfp);
                cachedPlaylist.m4613super(originalPlaylist != null ? originalPlaylist.yandex : 0L);
                cachedPlaylist.m4602import(originalPlaylist != null ? originalPlaylist.loadAd : 0L);
                cachedPlaylist.m4601goto(originalPlaylist != null ? originalPlaylist.crashlytics : null);
                cachedPlaylist.m4594continue(followedMetadata != null ? followedMetadata.loadAd : 0L);
                cachedPlaylist.m4593class(followedMetadata != null ? followedMetadata.yandex : 0L);
                InterfaceC11334l interfaceC11334lAppmetrica = cachedPlaylist.appmetrica();
                List list2 = audioPlaylist.license;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new CachedEmbeddedThumb((AlbumThumb) it.next()));
                }
                interfaceC11334lAppmetrica.addAll(arrayList2);
                InterfaceC11334l interfaceC11334lPurchase = cachedPlaylist.purchase();
                List list3 = audioPlaylist.adcel;
                ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new CachedTrack((AudioTrack) it2.next()));
                }
                interfaceC11334lPurchase.addAll(arrayList3);
                InterfaceC11334l interfaceC11334lStartapp = cachedPlaylist.startapp();
                List<Genre> list4 = audioPlaylist.vip;
                ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(list4, 10));
                for (Genre genre : list4) {
                    CachedVkGenre cachedVkGenre = new CachedVkGenre();
                    cachedVkGenre.crashlytics(genre.yandex);
                    cachedVkGenre.purchase(genre.loadAd);
                    arrayList4.add(cachedVkGenre);
                }
                interfaceC11334lStartapp.addAll(arrayList4);
                InterfaceC11334l interfaceC11334lSubscription = cachedPlaylist.subscription();
                List list5 = audioPlaylist.isVip;
                ArrayList arrayList5 = new ArrayList(AbstractC14055l.billing(list5, 10));
                Iterator it3 = list5.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new CachedArtist((MainArtist) it3.next()));
                }
                interfaceC11334lSubscription.addAll(arrayList5);
                cachedPlaylist.m4616this(audioPlaylist.advert);
                Boolean bool3 = audioPlaylist.ad;
                cachedPlaylist.m4614switch(bool3 != null ? bool3.booleanValue() : false);
                cachedPlaylist.m4596else(audioPlaylist.smaato);
                Long l = audioPlaylist.remoteconfig;
                cachedPlaylist.m4619transient(l != null ? l.longValue() : 0L);
                AudioPlaylist.AlbumMeta albumMeta = audioPlaylist.billing;
                if (albumMeta == null || (str = albumMeta.loadAd) == null) {
                    str = "playlist";
                }
                cachedPlaylist.m4600for(str);
                cachedPlaylist.m4617throw(audioPlaylist.f36624volatile);
                cachedPlaylist.m4598final(audioPlaylist.f36619native);
                cachedPlaylist.m4603instanceof(c17685l.billing);
                cachedPlaylist.m4617throw(true);
                cachedPlaylist.m4619transient(System.currentTimeMillis());
                cachedPlaylist.purchase().clear();
                cachedPlaylist.purchase().addAll(listM4243this);
                CachedPlaylist cachedPlaylist2 = (CachedPlaylist) c3918l.m1450l(cachedPlaylist);
                if (!AbstractC16648l.Signature(cachedPlaylist2.m4618throws(), "_-1337", false)) {
                    CachedPlaylistLibrary cachedPlaylistLibrary = (CachedPlaylistLibrary) c3918l.m1449l(AbstractC18202l.yandex.loadAd(CachedPlaylistLibrary.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).purchase().yandex();
                    if (cachedPlaylistLibrary != null) {
                        InterfaceC11334l interfaceC11334lYandex = cachedPlaylistLibrary.yandex();
                        if (interfaceC11334lYandex == null || !interfaceC11334lYandex.isEmpty()) {
                            Iterator<E> it4 = interfaceC11334lYandex.iterator();
                            while (it4.hasNext()) {
                                if (AbstractC8576l.yandex(((CachedPlaylist) it4.next()).m4618throws(), cachedPlaylist2.m4618throws())) {
                                }
                            }
                            cachedPlaylistLibrary.yandex().add(0, cachedPlaylist2);
                        } else {
                            cachedPlaylistLibrary.yandex().add(0, cachedPlaylist2);
                        }
                    } else {
                        CachedPlaylistLibrary cachedPlaylistLibrary2 = new CachedPlaylistLibrary();
                        cachedPlaylistLibrary2.purchase(1L);
                        cachedPlaylistLibrary2.yandex().add(0, cachedPlaylist2);
                        c3918l.m1450l(cachedPlaylistLibrary2);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                ((C13664l) this.f6511l).loadAd.subs((InterfaceC0684l) obj, (C1044l) this.f6510l);
                return Unit.INSTANCE;
            case 10:
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f6511l;
                C2994l c2994l = (C2994l) this.f6510l;
                C1336l c1336l2 = (C1336l) obj;
                AbstractC1757l.m1032else(c1336l2, new C15578l(-1832261167, true, new C4508l(4, interfaceC8714l2)), 3);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(-1168060731, true, new C7442l((Object) c2994l, (Object) interfaceC8714l2, i9)), 3);
                List list6 = ((C3554l) interfaceC8714l2.getValue()).f7469l;
                c1336l2.firebase(list6.size(), new C3768l(new C4741l(i8), list6, i11), new C3768l(new C4741l(22), list6, i7), new C15578l(802480018, true, new C3127l(list6, interfaceC8714l2, c2994l, 3)));
                return Unit.INSTANCE;
            case 11:
                ((C17775l) this.f6511l).loadAd.loadAd((C15083l) this.f6510l);
                return Unit.INSTANCE;
            case 12:
                C16102l c16102l = (C16102l) this.f6511l;
                C7246l c7246l = (C7246l) this.f6510l;
                List list7 = c16102l.loadAd;
                ((C1336l) obj).firebase(list7.size(), new C3768l(new C4741l(27), list7, i12), new Creturn(list7, 29, false), new C15578l(802480018, true, new C6780l(list7, c7246l, i12)));
                return Unit.INSTANCE;
            case 13:
                ((C2403l) this.f6511l).loadAd((InterfaceC12553l) this.f6510l);
                return Unit.INSTANCE;
            case 14:
                C7620l c7620l = (C7620l) this.f6511l;
                C16627l c16627l = (C16627l) this.f6510l;
                Function1 function2 = (Function1) obj;
                C16838l c16838l = c7620l.amazon;
                C14965l c14965l = c7620l.yandex;
                C15079l c15079l = c7620l.billing;
                c16838l.getClass();
                AbstractC17569l abstractC17569l = c16627l.yandex;
                if (abstractC17569l instanceof C2122l) {
                    List list8 = ((C2122l) abstractC17569l).f4763l;
                    C6886l c6886l5 = c16627l.loadAd;
                    int i24 = c16627l.crashlytics;
                    ArrayList arrayList6 = new ArrayList(list8.size());
                    int size6 = list8.size();
                    for (int i25 = 0; i25 < size6; i25++) {
                        Object obj6 = list8.get(i25);
                        if (AbstractC8576l.yandex(((C3407l) obj6).loadAd, c6886l5) && i24 == 0) {
                            arrayList6.add(obj6);
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        ArrayList arrayList7 = new ArrayList(list8.size());
                        int size7 = list8.size();
                        for (int i26 = 0; i26 < size7; i26++) {
                            Object obj7 = list8.get(i26);
                            ((C3407l) obj7).getClass();
                            if (i24 == 0) {
                                arrayList7.add(obj7);
                            }
                        }
                        if (!arrayList7.isEmpty()) {
                            list8 = arrayList7;
                        }
                        int iCompareTo = c6886l5.compareTo(C6886l.f14421l);
                        int i27 = c6886l5.f14426l;
                        if (iCompareTo < 0) {
                            int size8 = list8.size();
                            C6886l c6886l6 = null;
                            C6886l c6886l7 = null;
                            for (int i28 = 0; i28 < size8; i28++) {
                                C6886l c6886l8 = ((C3407l) list8.get(i28)).loadAd;
                                int i29 = c6886l8.f14426l;
                                if (AbstractC8576l.subs(i29, i27) < 0) {
                                    if (c6886l6 == null || AbstractC8576l.subs(i29, c6886l6.f14426l) > 0) {
                                        c6886l6 = c6886l8;
                                    }
                                } else if (AbstractC8576l.subs(i29, i27) <= 0) {
                                    c6886l6 = c6886l8;
                                    c6886l7 = c6886l6;
                                    if (c6886l6 == null) {
                                        c6886l6 = c6886l7;
                                    }
                                    arrayList = new ArrayList(list8.size());
                                    size5 = list8.size();
                                    for (i6 = 0; i6 < size5; i6++) {
                                        obj5 = list8.get(i6);
                                        if (AbstractC8576l.yandex(((C3407l) obj5).loadAd, c6886l6)) {
                                            arrayList.add(obj5);
                                        }
                                    }
                                } else if (c6886l7 == null || AbstractC8576l.subs(i29, c6886l7.f14426l) < 0) {
                                    c6886l7 = c6886l8;
                                }
                            }
                            if (c6886l6 == null) {
                                c6886l6 = c6886l7;
                            }
                            arrayList = new ArrayList(list8.size());
                            size5 = list8.size();
                            while (i6 < size5) {
                                obj5 = list8.get(i6);
                                if (AbstractC8576l.yandex(((C3407l) obj5).loadAd, c6886l6)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            C6886l c6886l9 = C6886l.f14418l;
                            if (c6886l5.compareTo(c6886l9) > 0) {
                                int size9 = list8.size();
                                C6886l c6886l10 = null;
                                C6886l c6886l11 = null;
                                for (int i30 = 0; i30 < size9; i30++) {
                                    C6886l c6886l12 = ((C3407l) list8.get(i30)).loadAd;
                                    int i31 = c6886l12.f14426l;
                                    if (AbstractC8576l.subs(i31, i27) < 0) {
                                        if (c6886l10 == null || AbstractC8576l.subs(i31, c6886l10.f14426l) > 0) {
                                            c6886l10 = c6886l12;
                                        }
                                    } else if (AbstractC8576l.subs(i31, i27) <= 0) {
                                        c6886l10 = c6886l12;
                                        c6886l11 = c6886l10;
                                        if (c6886l11 != null) {
                                            c6886l10 = c6886l11;
                                        }
                                        arrayList = new ArrayList(list8.size());
                                        size4 = list8.size();
                                        for (i5 = 0; i5 < size4; i5++) {
                                            obj4 = list8.get(i5);
                                            if (AbstractC8576l.yandex(((C3407l) obj4).loadAd, c6886l10)) {
                                                arrayList.add(obj4);
                                            }
                                        }
                                    } else if (c6886l11 == null || AbstractC8576l.subs(i31, c6886l11.f14426l) < 0) {
                                        c6886l11 = c6886l12;
                                    }
                                }
                                if (c6886l11 != null) {
                                    c6886l10 = c6886l11;
                                }
                                arrayList = new ArrayList(list8.size());
                                size4 = list8.size();
                                while (i5 < size4) {
                                    obj4 = list8.get(i5);
                                    if (AbstractC8576l.yandex(((C3407l) obj4).loadAd, c6886l10)) {
                                        arrayList.add(obj4);
                                    }
                                }
                            } else {
                                int size10 = list8.size();
                                C6886l c6886l13 = null;
                                C6886l c6886l14 = null;
                                for (int i32 = 0; i32 < size10; i32++) {
                                    C6886l c6886l15 = ((C3407l) list8.get(i32)).loadAd;
                                    if (AbstractC8576l.subs(c6886l15.f14426l, c6886l9.f14426l) <= 0) {
                                        int i33 = c6886l15.f14426l;
                                        if (AbstractC8576l.subs(i33, i27) < 0) {
                                            if (c6886l13 == null || AbstractC8576l.subs(i33, c6886l13.f14426l) > 0) {
                                                c6886l13 = c6886l15;
                                            }
                                        } else if (AbstractC8576l.subs(i33, i27) <= 0) {
                                            c6886l13 = c6886l15;
                                            c6886l14 = c6886l13;
                                            if (c6886l14 != null) {
                                                c6886l13 = c6886l14;
                                            }
                                            arrayList6 = new ArrayList(list8.size());
                                            size = list8.size();
                                            for (i = 0; i < size; i++) {
                                                obj3 = list8.get(i);
                                                if (AbstractC8576l.yandex(((C3407l) obj3).loadAd, c6886l13)) {
                                                    arrayList6.add(obj3);
                                                }
                                            }
                                            if (arrayList6.isEmpty()) {
                                                c6886l = C6886l.f14418l;
                                                size2 = list8.size();
                                                c6886l2 = null;
                                                c6886l3 = null;
                                                for (i2 = 0; i2 < size2; i2++) {
                                                    c6886l4 = ((C3407l) list8.get(i2)).loadAd;
                                                    if (c6886l != null || AbstractC8576l.subs(c6886l4.f14426l, c6886l.f14426l) >= 0) {
                                                        i4 = c6886l4.f14426l;
                                                        if (AbstractC8576l.subs(i4, i27) < 0) {
                                                            if (c6886l2 != null || AbstractC8576l.subs(i4, c6886l2.f14426l) > 0) {
                                                                c6886l2 = c6886l4;
                                                            }
                                                        } else if (AbstractC8576l.subs(i4, i27) <= 0) {
                                                            c6886l2 = c6886l4;
                                                            c6886l3 = c6886l2;
                                                            if (c6886l3 != null) {
                                                                c6886l2 = c6886l3;
                                                            }
                                                            arrayList = new ArrayList(list8.size());
                                                            size3 = list8.size();
                                                            for (i3 = 0; i3 < size3; i3++) {
                                                                obj2 = list8.get(i3);
                                                                if (AbstractC8576l.yandex(((C3407l) obj2).loadAd, c6886l2)) {
                                                                    arrayList.add(obj2);
                                                                }
                                                            }
                                                        } else if (c6886l3 != null || AbstractC8576l.subs(i4, c6886l3.f14426l) < 0) {
                                                            c6886l3 = c6886l4;
                                                        }
                                                    }
                                                }
                                                if (c6886l3 != null) {
                                                    c6886l2 = c6886l3;
                                                }
                                                arrayList = new ArrayList(list8.size());
                                                size3 = list8.size();
                                                while (i3 < size3) {
                                                    obj2 = list8.get(i3);
                                                    if (AbstractC8576l.yandex(((C3407l) obj2).loadAd, c6886l2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            }
                                        } else if (c6886l14 == null || AbstractC8576l.subs(i33, c6886l14.f14426l) < 0) {
                                            c6886l14 = c6886l15;
                                        }
                                    }
                                }
                                if (c6886l14 != null) {
                                    c6886l13 = c6886l14;
                                }
                                arrayList6 = new ArrayList(list8.size());
                                size = list8.size();
                                while (i < size) {
                                    obj3 = list8.get(i);
                                    if (AbstractC8576l.yandex(((C3407l) obj3).loadAd, c6886l13)) {
                                        arrayList6.add(obj3);
                                    }
                                }
                                if (arrayList6.isEmpty()) {
                                    c6886l = C6886l.f14418l;
                                    size2 = list8.size();
                                    c6886l2 = null;
                                    c6886l3 = null;
                                    while (i2 < size2) {
                                        c6886l4 = ((C3407l) list8.get(i2)).loadAd;
                                        if (c6886l != null) {
                                            i4 = c6886l4.f14426l;
                                            if (AbstractC8576l.subs(i4, i27) < 0) {
                                                if (c6886l2 != null) {
                                                    c6886l2 = c6886l4;
                                                } else {
                                                    c6886l2 = c6886l4;
                                                }
                                            } else if (AbstractC8576l.subs(i4, i27) <= 0) {
                                                c6886l2 = c6886l4;
                                                c6886l3 = c6886l2;
                                                if (c6886l3 != null) {
                                                    c6886l2 = c6886l3;
                                                }
                                                arrayList = new ArrayList(list8.size());
                                                size3 = list8.size();
                                                while (i3 < size3) {
                                                    obj2 = list8.get(i3);
                                                    if (AbstractC8576l.yandex(((C3407l) obj2).loadAd, c6886l2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (c6886l3 != null) {
                                                c6886l3 = c6886l4;
                                            } else {
                                                c6886l3 = c6886l4;
                                            }
                                        } else {
                                            i4 = c6886l4.f14426l;
                                            if (AbstractC8576l.subs(i4, i27) < 0) {
                                                if (c6886l2 != null) {
                                                    c6886l2 = c6886l4;
                                                } else {
                                                    c6886l2 = c6886l4;
                                                }
                                            } else if (AbstractC8576l.subs(i4, i27) <= 0) {
                                                c6886l2 = c6886l4;
                                                c6886l3 = c6886l2;
                                                if (c6886l3 != null) {
                                                    c6886l2 = c6886l3;
                                                }
                                                arrayList = new ArrayList(list8.size());
                                                size3 = list8.size();
                                                while (i3 < size3) {
                                                    obj2 = list8.get(i3);
                                                    if (AbstractC8576l.yandex(((C3407l) obj2).loadAd, c6886l2)) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            } else if (c6886l3 != null) {
                                                c6886l3 = c6886l4;
                                            } else {
                                                c6886l3 = c6886l4;
                                            }
                                        }
                                    }
                                    if (c6886l3 != null) {
                                        c6886l2 = c6886l3;
                                    }
                                    arrayList = new ArrayList(list8.size());
                                    size3 = list8.size();
                                    while (i3 < size3) {
                                        obj2 = list8.get(i3);
                                        if (AbstractC8576l.yandex(((C3407l) obj2).loadAd, c6886l2)) {
                                            arrayList.add(obj2);
                                        }
                                    }
                                }
                            }
                        }
                        arrayList6 = arrayList;
                    }
                    C0554l c0554l = c16838l.yandex;
                    if (arrayList6.size() > 0) {
                        C3407l c3407l = (C3407l) arrayList6.get(0);
                        c3407l.getClass();
                        synchronized (((C14529l) c0554l.f1956l)) {
                            try {
                                c14965l.getClass();
                                C12209l c12209l = new C12209l(c3407l);
                                C2033l c2033l = (C2033l) ((C1579l) c0554l.f1958l).loadAd(c12209l);
                                if (c2033l == null) {
                                    c2033l = (C2033l) ((C13660l) c0554l.f1957l).mopub(c12209l);
                                }
                                if (c2033l != null) {
                                    objInvoke2 = c2033l.yandex;
                                } else {
                                    Unit unit = Unit.INSTANCE;
                                    try {
                                        Context context = (Context) c14965l.f29441l;
                                        if (c3407l instanceof C3407l) {
                                            Typeface typefaceLoadAd2 = AbstractC7525l.loadAd(context, c3407l.yandex);
                                            objInvoke = Build.VERSION.SDK_INT >= 26 ? AbstractC13149l.yandex(typefaceLoadAd2, c3407l.crashlytics, context) : typefaceLoadAd2;
                                        } else {
                                            objInvoke = null;
                                        }
                                    } catch (Exception unused) {
                                        objInvoke = c15079l.invoke(c16627l);
                                    }
                                    C0554l.m627catch(c0554l, c3407l, c14965l, objInvoke);
                                    objInvoke2 = objInvoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        if (objInvoke2 == null) {
                            objInvoke2 = c15079l.invoke(c16627l);
                        }
                        c8195l = new C8195l(null, AbstractC1214l.crashlytics(c16627l.amazon, objInvoke2, c3407l, c16627l.loadAd, c16627l.crashlytics));
                    } else {
                        c8195l = new C8195l(null, c15079l.invoke(c16627l));
                    }
                    List list9 = (List) c8195l.f17098l;
                    Object obj8 = c8195l.f17097l;
                    if (list9 == null) {
                        c2451l = new C8902l(obj8, true);
                    } else {
                        C8978l c8978l = new C8978l(list9, obj8, c16627l, c16838l.yandex, function2, c14965l);
                        AbstractC10999l.mopub(c16838l.loadAd, null, 4, new C8912l(c8978l, null, 3), 1);
                        c2451l = new C2451l(c8978l);
                    }
                } else {
                    c2451l = null;
                }
                if (c2451l != null) {
                    return c2451l;
                }
                InterfaceC18693l interfaceC18693l = (InterfaceC18693l) c7620l.purchase.f32482l;
                AbstractC17569l abstractC17569l2 = c16627l.yandex;
                int i34 = c16627l.crashlytics;
                C6886l c6886l16 = c16627l.loadAd;
                if (abstractC17569l2 == null || (abstractC17569l2 instanceof C12067l)) {
                    typefaceLoadAd = interfaceC18693l.loadAd(i34, c6886l16);
                } else {
                    if (!(abstractC17569l2 instanceof C3944l)) {
                        if (abstractC17569l2 instanceof C6359l) {
                            typefaceLoadAd = (Typeface) ((C6359l) abstractC17569l2).f13327l.f25776l;
                        } else {
                            c8902l = null;
                        }
                        if (c8902l != null) {
                            return c8902l;
                        }
                        C8339l.smaato("Could not load font");
                        return null;
                    }
                    typefaceLoadAd = interfaceC18693l.firebase((C3944l) abstractC17569l2, c6886l16, i34);
                }
                c8902l = new C8902l(typefaceLoadAd, true);
                if (c8902l != null) {
                    return c8902l;
                }
                C8339l.smaato("Could not load font");
                return null;
            case 15:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f6511l;
                C7119l c7119l = (C7119l) this.f6510l;
                if (atomicBoolean.compareAndSet(false, true)) {
                    c7119l.amazon(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
            case 16:
                ((C2975l) this.f6511l).f6459l.removeCallbacks((RunnableC0336l) this.f6510l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Catalog2Button catalog2Button = (Catalog2Button) this.f6511l;
                C2979l c2979l = (C2979l) this.f6510l;
                InterfaceC13742l interfaceC13742l = (InterfaceC13742l) obj;
                List<Catalog2ReplacementOption> list10 = catalog2Button.subs;
                if (list10 != null) {
                    for (Catalog2ReplacementOption catalog2ReplacementOption : list10) {
                        String str4 = catalog2ReplacementOption.loadAd;
                        Integer num = catalog2ReplacementOption.amazon;
                        boolean z = num != null && num.intValue() == 1;
                        C12242l c12242l = new C12242l(c2979l, catalog2ReplacementOption, 18);
                        C13856l c13856l = (C13856l) interfaceC13742l;
                        c13856l.yandex.add(new C11967l(0, str4, z, new C10063l(c12242l, c13856l.loadAd, b6 == true ? 1 : 0)));
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C4595l c4595l = (C4595l) this.f6511l;
                String str5 = (String) this.f6510l;
                C16221l c16221l = (C16221l) obj;
                c16221l.amazon(C4595l.amazon, str5);
                c4595l.admob(c16221l, str5);
                return null;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C9916l c9916l = (C9916l) this.f6511l;
                View view = (View) this.f6510l;
                AudioPlaylist audioPlaylist2 = (AudioPlaylist) obj;
                AbstractC9694l abstractC9694l = c9916l.f20190l;
                if (abstractC9694l != null) {
                    abstractC9694l.mo782this();
                }
                AbstractC1213l.crashlytics(view, new C17398l(audioPlaylist2));
                return Unit.INSTANCE;
            case 20:
                C16864l c16864l = (C16864l) this.f6511l;
                AbstractC10022l abstractC10022l = (AbstractC10022l) this.f6510l;
                if (((Throwable) obj) != null) {
                    c16864l.f32923l.vip(AbstractC12704l.f25027l, abstractC10022l);
                }
                return Unit.INSTANCE;
            case 21:
                C0462l c0462l = (C0462l) this.f6511l;
                C9426l c9426l2 = (C9426l) this.f6510l;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    c9426l2.m2649l(th3);
                }
                c0462l.m561l();
                return Unit.INSTANCE;
            case 22:
                C13138l c13138l = (C13138l) this.f6511l;
                C8456l c8456l = (C8456l) this.f6510l;
                c13138l.yandex.crashlytics(c8456l);
                c13138l.loadAd.setValue(Boolean.TRUE);
                return new C18616l(c13138l, c8456l, i14);
            case 23:
                C2093l c2093l = (C2093l) this.f6511l;
                C8788l c8788l = (C8788l) this.f6510l;
                C17368l c17368lLoadAd = c2093l.loadAd(((Integer) obj).intValue());
                int i35 = c17368lLoadAd.yandex;
                List list11 = c17368lLoadAd.loadAd;
                ArrayList arrayList8 = new ArrayList(list11.size());
                int size11 = list11.size();
                int i36 = 0;
                for (int i37 = 0; i37 < size11; i37++) {
                    int i38 = (int) ((C1398l) list11.get(i37)).yandex;
                    arrayList8.add(new C8195l(Integer.valueOf(i35), new C15519l(c8788l.yandex(i36, i38))));
                    i35++;
                    i36 += i38;
                }
                return arrayList8;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C8788l c8788l2 = (C8788l) this.f6511l;
                C8135l c8135l = (C8135l) this.f6510l;
                int iIntValue = ((Integer) obj).intValue();
                C2093l c2093l2 = (C2093l) c8788l2.admob;
                int i39 = c2093l2.subs;
                int iPurchase = c2093l2.purchase(iIntValue);
                return c8135l.m2273l(iIntValue, 0, iPurchase, c8135l.f17005l, c8788l2.yandex(0, iPurchase));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C10641l c10641l = (C10641l) this.f6511l;
                Object obj9 = this.f6510l;
                c10641l.f21595l.isPro(obj9);
                return new C18616l(c10641l, obj9, i10);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C10641l((InterfaceC2449l) this.f6511l, (Map) obj, (InterfaceC17865l) this.f6510l);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C5073l c5073l = (C5073l) this.f6511l;
                C13765l c13765l = (C13765l) this.f6510l;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(1477791666, true, new C3973l(c5073l, i13)), 3);
                if (((C15744l) c5073l.f11086l.getValue()).f30927l) {
                    AbstractC1757l.appmetrica(c1336l3, null, null, new C15578l(-703744755, true, new C0750l(i13, c5073l, c13765l)), 3);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C12375l c12375l = (C12375l) this.f6511l;
                View view2 = (View) this.f6510l;
                InterfaceC13742l interfaceC13742l2 = (InterfaceC13742l) obj;
                for (C12823l c12823l : c12375l.amazon) {
                    String str6 = (String) c12823l.f25200l;
                    boolean zBooleanValue = ((Boolean) c12823l.f25199l).booleanValue();
                    C9810l c9810l = new C9810l(c12823l, view2, i13);
                    C13856l c13856l2 = (C13856l) interfaceC13742l2;
                    c13856l2.yandex.add(new C11967l(0, str6, zBooleanValue, new C10063l(c9810l, c13856l2.loadAd, b7 == true ? 1 : 0)));
                }
                return Unit.INSTANCE;
            default:
                Context context2 = (Context) this.f6511l;
                MainArtist mainArtist = (MainArtist) this.f6510l;
                AppActivity appActivity = (AppActivity) context2;
                String str7 = mainArtist.yandex;
                if (str7 == null && (str7 = mainArtist.loadAd) == null) {
                    return Unit.INSTANCE;
                }
                appActivity.license(new C13379l(str7));
                appActivity.applovin();
                return Unit.INSTANCE;
        }
    }
}
