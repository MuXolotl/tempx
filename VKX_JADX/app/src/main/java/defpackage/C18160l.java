package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.cache.realm.CachedAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;
import ua.itaysonlab.vkxreborn.playback.auto.VkxArtworkContentProvider;

/* JADX INFO: renamed from: l٘ۘۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18160l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f35559l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f35560l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18160l(int i, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f35559l = 6;
        this.f35560l = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r13v2 */
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
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) throws Throwable {
        Object objPurchase;
        Object objSmaato;
        Object objLoadAd;
        int i = this.f35559l;
        int i2 = 13;
        int i3 = 20;
        char c = 0;
        Object obj2 = EnumC9342l.f19165l;
        char c2 = 1;
        C16076l c16076l = 0;
        switch (i) {
            case 0:
                int i4 = this.f35560l;
                if (i4 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16287l c16287l = C16287l.yandex;
                    this.f35560l = 1;
                    c16287l.getClass();
                    C16552l c16552l = AbstractC11463l.yandex;
                    if (AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C4967l(2, null), this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i5 = this.f35560l;
                if (i5 != 0) {
                    if (i5 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C16534l c16534l = new C16534l();
                this.f35560l = 1;
                Object objAdmob = AbstractC8189l.admob(c16534l, this);
                return objAdmob == obj2 ? obj2 : objAdmob;
            case 2:
                int i6 = this.f35560l;
                if (i6 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f35560l = 1;
                    if (AbstractC8532l.purchase(3000L, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i6 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 3:
                int i7 = this.f35560l;
                if (i7 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13042l c13042l = C13042l.f25547l;
                    this.f35560l = 1;
                    if (c13042l.amazon(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i7 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 4:
                int i8 = this.f35560l;
                if (i8 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16076l c16076l2 = VKXApplication.f36632l;
                    c16076l = c16076l2 != null ? c16076l2 : 0;
                    this.f35560l = 1;
                    Object objSubs = c16076l.f31511l.subs(c16076l, this);
                    if (objSubs != obj2) {
                        objSubs = Unit.INSTANCE;
                    }
                    if (objSubs == obj2) {
                        return obj2;
                    }
                } else {
                    if (i8 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 5:
                int i9 = this.f35560l;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                this.f35560l = 1;
                C6336l c6336l = C6336l.yandex;
                Object objBilling = C6336l.billing(new C8578l(6), this);
                return objBilling == obj2 ? obj2 : objBilling;
            case 6:
                AbstractC2829l.crashlytics(obj);
                C3392l c3392l = AbstractC17549l.billing;
                Bitmap bitmap = (Bitmap) (c3392l != null ? c3392l : null).invoke(new Integer(AbstractC17549l.purchase));
                int i10 = this.f35560l;
                return i10 == 1024 ? bitmap : Bitmap.createScaledBitmap(bitmap, i10, i10, true);
            case 7:
                int i11 = this.f35560l;
                AbstractC2829l.crashlytics(obj);
                return Boolean.valueOf(i11 > 0);
            case 8:
                int i12 = this.f35560l;
                if (i12 != 0) {
                    if (i12 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C16552l c16552l2 = AbstractC11463l.yandex;
                C2975l c2975l = AbstractC17278l.yandex;
                C9000l c9000l = new C9000l(2, null);
                this.f35560l = 1;
                Object objFirebase = AbstractC10999l.firebase(c2975l, c9000l, this);
                return objFirebase == obj2 ? obj2 : objFirebase;
            case 9:
                int i13 = this.f35560l;
                if (i13 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6336l c6336l2 = C6336l.yandex;
                    C18334l c18334l = new C18334l(i3);
                    this.f35560l = 1;
                    if (C6336l.mopub(c18334l, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i13 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 10:
                int i14 = this.f35560l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16552l c16552l3 = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l = ExecutorC6708l.f14063l;
                    C18160l c18160l = new C18160l(2, c16076l, 9);
                    this.f35560l = 1;
                    if (AbstractC10999l.firebase(executorC6708l, c18160l, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 11:
                int i15 = this.f35560l;
                if (i15 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C13434l c13434l = C13434l.yandex;
                    this.f35560l = 1;
                    if (c13434l.yandex(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i15 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 12:
                int i16 = this.f35560l;
                if (i16 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11485l c11485l = C11485l.f23075l;
                    this.f35560l = 1;
                    objPurchase = c11485l.purchase(this);
                    if (objPurchase == obj2) {
                        return obj2;
                    }
                } else {
                    if (i16 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objPurchase = obj;
                }
                Iterable<CachedAlbum> iterable = (Iterable) objPurchase;
                ArrayList arrayList = new ArrayList(AbstractC14055l.billing(iterable, 10));
                for (CachedAlbum cachedAlbum : iterable) {
                    C0935l c0935l = new C0935l();
                    C9258l c9258l = AbstractC1186l.f3181l;
                    C13708l c13708l = C13708l.f26763l;
                    List list = Collections.EMPTY_LIST;
                    C13708l c13708l2 = C13708l.f26763l;
                    C2410l c2410l = new C2410l();
                    C11470l c11470l = C11470l.amazon;
                    String str = "ext:album_cached:" + cachedAlbum.remoteconfig();
                    C3117l c3117l = new C3117l();
                    c3117l.yandex = cachedAlbum.isPro();
                    c3117l.billing = cachedAlbum.loadAd();
                    int i17 = VkxArtworkContentProvider.f36827l;
                    String strRemoteconfig = cachedAlbum.remoteconfig();
                    if (strRemoteconfig == null) {
                        strRemoteconfig = "";
                    }
                    c3117l.vip = new Uri.Builder().scheme("content").authority("ua.itaysonlab.vkx.service.artwork").path("album_cached").appendPath(strRemoteconfig).build();
                    c3117l.f6662synchronized = new Integer(13);
                    c3117l.subscription = Boolean.TRUE;
                    c3117l.ads = Boolean.FALSE;
                    c3117l.f6661strictfp = AbstractC1315l.loadAd(new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", new Integer(2)), new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", new Integer(2)), new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", cachedAlbum.isPro()));
                    arrayList.add(new C2427l(str, new C9202l(c0935l), null, new C7828l(c2410l), new C3852l(c3117l), c11470l));
                }
                return arrayList;
            case 13:
                int i18 = this.f35560l;
                if (i18 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C11485l c11485l2 = C11485l.f23075l;
                    this.f35560l = 1;
                    objSmaato = c11485l2.smaato(this);
                    if (objSmaato == obj2) {
                        return obj2;
                    }
                } else {
                    if (i18 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objSmaato = obj;
                }
                Iterable<CachedPlaylist> iterable2 = (Iterable) objSmaato;
                ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(iterable2, 10));
                for (CachedPlaylist cachedPlaylist : iterable2) {
                    C0935l c0935l2 = new C0935l();
                    C9258l c9258l2 = AbstractC1186l.f3181l;
                    C13708l c13708l3 = C13708l.f26763l;
                    List list2 = Collections.EMPTY_LIST;
                    C13708l c13708l4 = C13708l.f26763l;
                    C2410l c2410l2 = new C2410l();
                    C11470l c11470l2 = C11470l.amazon;
                    String str2 = "ext:playlist_cached:" + cachedPlaylist.m4618throws();
                    C3117l c3117l2 = new C3117l();
                    c3117l2.yandex = cachedPlaylist.inmobi();
                    String strIsVip = cachedPlaylist.isVip();
                    if (strIsVip == null) {
                        strIsVip = "";
                    }
                    c3117l2.billing = strIsVip;
                    int i19 = VkxArtworkContentProvider.f36827l;
                    char c3 = c;
                    char c4 = c2;
                    c3117l2.vip = new Uri.Builder().scheme("content").authority("ua.itaysonlab.vkx.service.artwork").path("playlist_cached").appendPath(cachedPlaylist.m4618throws()).build();
                    c3117l2.f6662synchronized = new Integer(i2);
                    c3117l2.subscription = Boolean.TRUE;
                    c3117l2.ads = Boolean.FALSE;
                    C8195l c8195l = new C8195l("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT", new Integer(2));
                    C8195l c8195l2 = new C8195l("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT", new Integer(2));
                    C8195l c8195l3 = new C8195l("bruhcollective.itaysonlab.vkx.auto.SOURCE_NAME", cachedPlaylist.inmobi());
                    C8195l[] c8195lArr = new C8195l[3];
                    c8195lArr[c3] = c8195l;
                    c8195lArr[c4] = c8195l2;
                    c8195lArr[2] = c8195l3;
                    c3117l2.f6661strictfp = AbstractC1315l.loadAd(c8195lArr);
                    arrayList2.add(new C2427l(str2, new C9202l(c0935l2), null, new C7828l(c2410l2), new C3852l(c3117l2), c11470l2));
                    c = c3;
                    c2 = c4;
                    i2 = 13;
                }
                return arrayList2;
            case 14:
                int i20 = this.f35560l;
                if (i20 != 0) {
                    if (i20 == 1) {
                        AbstractC2829l.crashlytics(obj);
                        return obj;
                    }
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
                C5374l c5374l = AbstractC16584l.yandex().crashlytics;
                boolean zLoadAd = C16287l.yandex.loadAd();
                int i21 = Build.VERSION.SDK_INT;
                this.f35560l = 1;
                Object objAmazon = AbstractC17780l.amazon(c5374l, "android", zLoadAd, 100136, i21, this);
                return objAmazon == obj2 ? obj2 : objAmazon;
            case 15:
                int i22 = this.f35560l;
                if (i22 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C8490l c8490l = AbstractC6025l.yandex;
                    this.f35560l = 1;
                    if (AbstractC6025l.yandex(C15200l.yandex, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i22 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 16:
                int i23 = this.f35560l;
                if (i23 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C16076l c16076lCrashlytics = C17539l.crashlytics();
                    this.f35560l = 1;
                    objLoadAd = c16076lCrashlytics.loadAd(this);
                    if (objLoadAd == obj2) {
                        return obj2;
                    }
                } else {
                    if (i23 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                    objLoadAd = obj;
                }
                C16811l c16811l = (C16811l) objLoadAd;
                c16811l.smaato(0, 0L);
                c16811l.mo2801protected();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                int i24 = this.f35560l;
                if (i24 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    this.f35560l = 1;
                    if (AbstractC13359l.billing(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i24 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int i25 = this.f35560l;
                if (i25 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C6336l c6336l3 = C6336l.yandex;
                    C1698l c1698l = new C1698l(i3);
                    this.f35560l = 1;
                    if (C6336l.mopub(c1698l, this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i25 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            default:
                int i26 = this.f35560l;
                if (i26 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C7268l c7268l = C7268l.f15111l;
                    this.f35560l = 1;
                    c7268l.getClass();
                    if (C7268l.purchase(this) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i26 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = 2;
        switch (this.f35559l) {
            case 0:
                return new C18160l(i, interfaceC14029l, 0);
            case 1:
                return new C18160l(i, interfaceC14029l, 1);
            case 2:
                return new C18160l(i, interfaceC14029l, i);
            case 3:
                return new C18160l(i, interfaceC14029l, 3);
            case 4:
                return new C18160l(i, interfaceC14029l, 4);
            case 5:
                return new C18160l(i, interfaceC14029l, 5);
            case 6:
                return new C18160l(this.f35560l, interfaceC14029l);
            case 7:
                C18160l c18160l = new C18160l(i, interfaceC14029l, 7);
                c18160l.f35560l = ((Number) obj).intValue();
                return c18160l;
            case 8:
                return new C18160l(i, interfaceC14029l, 8);
            case 9:
                return new C18160l(i, interfaceC14029l, 9);
            case 10:
                return new C18160l(i, interfaceC14029l, 10);
            case 11:
                return new C18160l(i, interfaceC14029l, 11);
            case 12:
                return new C18160l(i, interfaceC14029l, 12);
            case 13:
                return new C18160l(i, interfaceC14029l, 13);
            case 14:
                return new C18160l(i, interfaceC14029l, 14);
            case 15:
                return new C18160l(i, interfaceC14029l, 15);
            case 16:
                return new C18160l(i, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C18160l(i, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C18160l(i, interfaceC14029l, 18);
            default:
                return new C18160l(i, interfaceC14029l, 19);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f35559l) {
            case 0:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C18160l) ads((InterfaceC14029l) obj2, Integer.valueOf(((Number) obj).intValue()))).Signature(Unit.INSTANCE);
            case 2:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C18160l) ads((InterfaceC14029l) obj2, Integer.valueOf(((Number) obj).intValue()))).Signature(Unit.INSTANCE);
            case 8:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C18160l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18160l(int i, InterfaceC14029l interfaceC14029l, int i2) {
        super(i, interfaceC14029l);
        this.f35559l = i2;
    }
}
