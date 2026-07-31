package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.itunesutil.ItunesSearch$ITunesResponse;
import ua.itaysonlab.itunesutil.ItunesSearch$ItunesItem;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lِؗؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4647l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f9451l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f9452l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f9453l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ Object f9454l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f9455l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4647l(InterfaceC15829l interfaceC15829l, Function3 function3, Object obj, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9453l = 9;
        this.f9452l = interfaceC15829l;
        this.f9454l = function3;
        this.f9451l = obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x008a A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:9:0x001e, B:15:0x0029, B:17:0x004d, B:18:0x006d, B:20:0x0073, B:21:0x0081, B:24:0x008a), top: B:44:0x001e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x008a, please report this as an issue */
    private final Object ad(Object obj) {
        Object c18435l;
        AudioTrack audioTrack = (AudioTrack) this.f9454l;
        int i = this.f9455l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            try {
                AudioAlbum audioAlbum = audioTrack.vip;
                if (audioAlbum != null) {
                    C3694l c3694l = C3694l.yandex;
                    ItunesSearch$ITunesResponse itunesSearch$ITunesResponseCrashlytics = C3694l.crashlytics(AbstractC16676l.admob(audioTrack) + ' ' + audioAlbum.amazon, "album");
                    if (itunesSearch$ITunesResponseCrashlytics.yandex > 0) {
                        String str = audioAlbum.amazon;
                        List list = itunesSearch$ITunesResponseCrashlytics.loadAd;
                        C14419l c14419l = C14419l.f28229l;
                        ArrayList arrayListPurchase = AbstractC15011l.purchase(str, list, new C11467l(11));
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(arrayListPurchase, 10));
                        Iterator it = arrayListPurchase.iterator();
                        while (it.hasNext()) {
                            arrayList.add((ItunesSearch$ItunesItem) ((C2372l) it.next()).f5132l);
                        }
                        c18435l = (ItunesSearch$ItunesItem) AbstractC16901l.m4217extends(arrayList);
                    } else {
                        C3694l c3694l2 = C3694l.yandex;
                        c18435l = (ItunesSearch$ItunesItem) AbstractC16901l.m4217extends(C3694l.crashlytics(AbstractC16676l.admob(audioTrack) + ' ' + audioTrack.amazon, "song").loadAd);
                    }
                } else {
                    C3694l c3694l3 = C3694l.yandex;
                    c18435l = (ItunesSearch$ItunesItem) AbstractC16901l.m4217extends(C3694l.crashlytics(AbstractC16676l.admob(audioTrack) + ' ' + audioTrack.amazon, "song").loadAd);
                }
            } catch (Throwable th) {
                c18435l = new C18435l(th);
            }
            if (c18435l instanceof C18435l) {
                c18435l = null;
            }
            ItunesSearch$ItunesItem itunesSearch$ItunesItem = (ItunesSearch$ItunesItem) c18435l;
            C1579l c1579l = C3694l.crashlytics;
            C3694l c3694l4 = C3694l.yandex;
            AudioAlbum audioAlbum2 = audioTrack.vip;
            c1579l.crashlytics(audioAlbum2 != null ? audioAlbum2.loadAd() : AbstractC16676l.mopub(audioTrack), itunesSearch$ItunesItem == null ? ItunesSearch$ItunesItem.remoteconfig : itunesSearch$ItunesItem);
            if (itunesSearch$ItunesItem != null) {
                this.f9452l = null;
                this.f9451l = c18435l;
                this.f9455l = 1;
                Unit unit = Unit.INSTANCE;
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (unit == enumC9342l) {
                    return enumC9342l;
                }
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object advert(Object obj) {
        C0657l c0657l;
        C15399l c15399l = (C15399l) this.f9452l;
        String str = (String) this.f9454l;
        int i = this.f9455l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            this.f9455l = 1;
            obj = c15399l.purchase(str, this);
            if (obj != enumC9342l) {
            }
            return enumC9342l;
        }
        if (i == 1) {
            AbstractC2829l.crashlytics(obj);
        } else {
            if (i != 2) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c0657l = (C0657l) this.f9451l;
            AbstractC2829l.crashlytics(obj);
        }
        return new Integer(AbstractC5573l.ads(((((C3844l) obj).purchase() / c0657l.loadAd.yandex) * 8.0f) / 1000.0f));
        C9173l c9173l = (C9173l) obj;
        List list = c9173l.yandex;
        C0657l c0657l2 = (C0657l) list.get(list.size() / 2);
        String str2 = c0657l2.yandex;
        c15399l.getClass();
        String strCrashlytics = C15399l.crashlytics(str, str2);
        int i2 = c9173l.amazon;
        this.f9451l = c0657l2;
        this.f9455l = 2;
        obj = C15399l.yandex(c15399l, strCrashlytics, c0657l2, i2, C14054l.f27396l, this);
        if (obj != enumC9342l) {
            c0657l = c0657l2;
            return new Integer(AbstractC5573l.ads(((((C3844l) obj).purchase() / c0657l.loadAd.yandex) * 8.0f) / 1000.0f));
        }
        return enumC9342l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c0, code lost:
    
        if (r7.billing(r17, r0) == r12) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object applovin(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4647l.applovin(java.lang.Object):java.lang.Object");
    }

    private final Object inmobi(Object obj) {
        int i = this.f9455l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            AbstractC5006l abstractC5006l = ((C3237l) this.f9451l).yandex;
            Uri uri = (Uri) this.f9452l;
            InputEvent inputEvent = (InputEvent) this.f9454l;
            this.f9455l = 1;
            Object objMopub = abstractC5006l.mopub(uri, inputEvent, this);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objMopub == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object isVip(Object obj) {
        C5807l c5807l = (C5807l) this.f9452l;
        int i = this.f9455l;
        try {
            if (i == 0) {
                AbstractC2829l.crashlytics(obj);
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f9451l;
                Function2 function2 = (Function2) this.f9454l;
                this.f9455l = 1;
                obj = function2.invoke(interfaceC2262l, this);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (obj == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC2829l.crashlytics(obj);
            }
            c5807l.loadAd(obj);
        } catch (CancellationException unused) {
            c5807l.crashlytics();
        } catch (Throwable th) {
            c5807l.amazon(th);
        }
        return Unit.INSTANCE;
    }

    private final Object premium(Object obj) {
        int i = this.f9455l;
        if (i == 0) {
            AbstractC2829l.crashlytics(obj);
            C15399l c15399l = C1083l.f2983l;
            String str = (String) this.f9451l;
            File file = (File) this.f9452l;
            C6028l c6028l = new C6028l((Function2) this.f9454l);
            this.f9455l = 1;
            c15399l.getClass();
            Object objAdmob = AbstractC11990l.admob(new C6537l(c6028l, c15399l, str, file, null), this);
            Object obj2 = EnumC9342l.f19165l;
            if (objAdmob != obj2) {
                objAdmob = Unit.INSTANCE;
            }
            if (objAdmob == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0253  */
    /* JADX WARN: Code duplicated, block: B:106:0x0260 A[Catch: all -> 0x02ce, TRY_LEAVE, TryCatch #11 {all -> 0x02ce, blocks: (B:101:0x0249, B:104:0x0254, B:106:0x0260), top: B:174:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:143:0x032d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0330  */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6 A[Catch: all -> 0x0069, TryCatch #5 {all -> 0x0069, blocks: (B:18:0x0062, B:42:0x00e6, B:43:0x00e9, B:47:0x00f4, B:48:0x00f9, B:34:0x00be, B:38:0x00cc), top: B:157:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #5 {all -> 0x0069, blocks: (B:18:0x0062, B:42:0x00e6, B:43:0x00e9, B:47:0x00f4, B:48:0x00f9, B:34:0x00be, B:38:0x00cc), top: B:157:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0184  */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:85:0x01be  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d6 A[PHI: r0 r7
  0x01d6: PHI (r0v24 lؘ٘ٛ) = (r0v11 lؘ٘ٛ), (r0v70 lؘ٘ٛ) binds: [B:86:0x01d2, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x01d6: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v15 java.lang.Object) binds: [B:86:0x01d2, B:12:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x01de  */
    /* JADX WARN: Code duplicated, block: B:99:0x0216 A[Catch: all -> 0x002e, TRY_ENTER, TRY_LEAVE, TryCatch #12 {all -> 0x002e, blocks: (B:7:0x0028, B:99:0x0216, B:100:0x023d, B:107:0x0263, B:108:0x026a), top: B:157:0x001a }] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b6, code lost:
    
        if (r0.mo1554while(r3, r5, r24) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013c, code lost:
    
        if (r0.mo1554while(r3, r5, r24) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        if (r0.mo1554while(r3, r5, r24) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b7, code lost:
    
        if (r0.mo1554while(r3, r5, r24) == r11) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x020f, code lost:
    
        if (r0.mo1554while(r3, r5, r24) == r11) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, lٍؗؐ] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class, java.lang.Class<lٌؘِ>] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r5v7, types: [lٕؔؒ] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object pro(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4647l.pro(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:237:0x0419 A[LOOP:1: B:235:0x0410->B:237:0x0419, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:578:0x0423 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66, types: [lؚٓٝ] */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r1v98 */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v101 */
    /* JADX WARN: Type inference failed for: r2v80, types: [lِٔؐ] */
    /* JADX WARN: Type inference failed for: r2v82, types: [lؚؚۖ] */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v84, types: [lِٔؐ] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:251:0x046d -> B:253:0x0471). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:267:0x04c0 -> B:224:0x03c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x016f -> B:78:0x0173). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:578:0x0423
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC12050l
    public final java.lang.Object Signature(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 2682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4647l.Signature(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f9453l;
        Object obj2 = this.f9454l;
        switch (i) {
            case 0:
                C4647l c4647l = new C4647l((C0360l) this.f9452l, (Function2) obj2, (InterfaceC8282l) null, interfaceC14029l);
                c4647l.f9451l = obj;
                return c4647l;
            case 1:
                return new C4647l((AudioTrack) this.f9451l, (DedicatedCacheService) this.f9452l, (CachedTrack) obj2, interfaceC14029l, 1);
            case 2:
                return new C4647l((C10251l) this.f9451l, (EnumC11011l) this.f9452l, (Function2) obj2, interfaceC14029l, 2);
            case 3:
                C4647l c4647l2 = new C4647l((C7239l) this.f9452l, (Function2) obj2, interfaceC14029l, 3);
                c4647l2.f9451l = obj;
                return c4647l2;
            case 4:
                return new C4647l((C7239l) this.f9451l, (EnumC11011l) this.f9452l, (Function2) obj2, interfaceC14029l, 4);
            case 5:
                C4647l c4647l3 = new C4647l(this.f9452l, (AbstractC10022l) obj2, interfaceC14029l, 5);
                c4647l3.f9451l = obj;
                return c4647l3;
            case 6:
                return new C4647l((C14358l) this.f9451l, interfaceC14029l, (Map) this.f9452l, (EnumC10534l) obj2, 6);
            case 7:
                return new C4647l((C14358l) this.f9451l, interfaceC14029l, (C16443l) this.f9452l, (Map) obj2, 7);
            case 8:
                C4647l c4647l4 = new C4647l((Function3) this.f9452l, obj2, interfaceC14029l, 8);
                c4647l4.f9451l = obj;
                return c4647l4;
            case 9:
                return new C4647l((InterfaceC15829l) this.f9452l, (Function3) obj2, this.f9451l, interfaceC14029l);
            case 10:
                return new C4647l((C13046l) this.f9451l, (C14187l) this.f9452l, (ClassLoader) obj2, interfaceC14029l, 10);
            case 11:
                return new C4647l((C4530l) this.f9452l, (C16854l) obj2, interfaceC14029l, 11);
            case 12:
                C4647l c4647l5 = new C4647l((C15926l) obj2, interfaceC14029l, 12);
                c4647l5.f9451l = obj;
                return c4647l5;
            case 13:
                C4647l c4647l6 = new C4647l((C7246l) obj2, interfaceC14029l, 13);
                c4647l6.f9451l = obj;
                return c4647l6;
            case 14:
                C4647l c4647l7 = new C4647l((C2403l) this.f9452l, (C9154l) obj2, interfaceC14029l, 14);
                c4647l7.f9451l = obj;
                return c4647l7;
            case 15:
                C4647l c4647l8 = new C4647l((C1640l) this.f9452l, (InterfaceC9427l) obj2, interfaceC14029l, 15);
                c4647l8.f9451l = obj;
                return c4647l8;
            case 16:
                return new C4647l((InterfaceC12932l) this.f9451l, (InterfaceC6942l) this.f9452l, (C5655l) obj2, interfaceC14029l, 16);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C4647l((C2403l) this.f9451l, (InterfaceC12553l) this.f9452l, (InterfaceC11791l) obj2, interfaceC14029l, 17);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C4647l((Context) this.f9451l, (C18662l) this.f9452l, (BroadcastReceiver.PendingResult) obj2, interfaceC14029l, 18);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C4647l((C7119l) obj2, interfaceC14029l, 19);
            case 20:
                return new C4647l((C9122l) this.f9451l, (C9916l) this.f9452l, (C17015l) obj2, interfaceC14029l, 20);
            case 21:
                C4647l c4647l9 = new C4647l((C15814l) obj2, interfaceC14029l, 21);
                c4647l9.f9451l = obj;
                return c4647l9;
            case 22:
                C4647l c4647l10 = new C4647l((AudioTrack) obj2, interfaceC14029l, 22);
                c4647l10.f9452l = obj;
                return c4647l10;
            case 23:
                return new C4647l((C7136l) this.f9451l, (InterfaceC17807l) this.f9452l, (C11925l) obj2, interfaceC14029l, 23);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C4647l((C15399l) this.f9452l, (String) obj2, interfaceC14029l, 24);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C4647l c4647l11 = new C4647l((Function2) obj2, (C5807l) this.f9452l, interfaceC14029l);
                c4647l11.f9451l = obj;
                return c4647l11;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C4647l((String) this.f9451l, (File) this.f9452l, (Function2) obj2, interfaceC14029l, 26);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C4647l c4647l12 = new C4647l((C2586l) obj2, interfaceC14029l, 27);
                c4647l12.f9451l = obj;
                return c4647l12;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C4647l((C3237l) this.f9451l, (Uri) this.f9452l, (InputEvent) obj2, interfaceC14029l, 28);
            default:
                return new C4647l((C11625l) this.f9451l, (EnumC11011l) this.f9452l, (Function2) obj2, interfaceC14029l, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9453l) {
            case 0:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 1:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 2:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 3:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC1555l) obj)).Signature(Unit.INSTANCE);
            case 4:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 5:
                return ((C4647l) ads((InterfaceC14029l) obj2, (C16144l) obj)).Signature(Unit.INSTANCE);
            case 6:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 7:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 8:
                return ((C4647l) ads((InterfaceC14029l) obj2, obj)).Signature(Unit.INSTANCE);
            case 9:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 10:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 11:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 12:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 13:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 14:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 15:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 16:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 20:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 21:
                return ((C4647l) ads((InterfaceC14029l) obj2, (C14585l) obj)).Signature(Unit.INSTANCE);
            case 22:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case 23:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (Float) obj)).Signature(Unit.INSTANCE);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
            default:
                return ((C4647l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4647l(C0360l c0360l, Function2 function2, InterfaceC8282l interfaceC8282l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9453l = 0;
        this.f9452l = c0360l;
        this.f9454l = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4647l(C14358l c14358l, InterfaceC14029l interfaceC14029l, Object obj, Object obj2, int i) {
        super(2, interfaceC14029l);
        this.f9453l = i;
        this.f9451l = c14358l;
        this.f9452l = obj;
        this.f9454l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4647l(Object obj, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9453l = i;
        this.f9454l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4647l(Object obj, Object obj2, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9453l = i;
        this.f9452l = obj;
        this.f9454l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4647l(Object obj, Object obj2, Object obj3, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f9453l = i;
        this.f9451l = obj;
        this.f9452l = obj2;
        this.f9454l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4647l(Function2 function2, C5807l c5807l, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9453l = 25;
        this.f9454l = function2;
        this.f9452l = c5807l;
    }
}
