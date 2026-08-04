package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkxreborn.playback.util.QueueSaveHolder$VkxMetadataState;

/* JADX INFO: renamed from: lٕؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15417l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public Object f30126l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Object f30127l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f30128l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f30129l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Object f30130l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f30131l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public Object f30132l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15417l(Object obj, Context context, int i, Object obj2, InterfaceC14029l interfaceC14029l, int i2) {
        super(2, interfaceC14029l);
        this.f30129l = i2;
        this.f30127l = obj;
        this.f30130l = context;
        this.f30128l = i;
        this.f30132l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0350 A[Catch: all -> 0x0244, TryCatch #3 {all -> 0x0244, blocks: (B:89:0x0240, B:156:0x03cd, B:94:0x024b, B:97:0x0258, B:153:0x03ad, B:100:0x0268, B:146:0x037f, B:148:0x0388, B:103:0x027a, B:141:0x034c, B:143:0x0350, B:134:0x032f, B:161:0x03d8, B:162:0x040b, B:164:0x0411, B:165:0x041f), top: B:264:0x0213 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x037d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0388 A[Catch: all -> 0x0244, TryCatch #3 {all -> 0x0244, blocks: (B:89:0x0240, B:156:0x03cd, B:94:0x024b, B:97:0x0258, B:153:0x03ad, B:100:0x0268, B:146:0x037f, B:148:0x0388, B:103:0x027a, B:141:0x034c, B:143:0x0350, B:134:0x032f, B:161:0x03d8, B:162:0x040b, B:164:0x0411, B:165:0x041f), top: B:264:0x0213 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:155:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:171:0x044d  */
    /* JADX WARN: Code duplicated, block: B:174:0x0454  */
    /* JADX WARN: Code duplicated, block: B:177:0x045a  */
    /* JADX WARN: Code duplicated, block: B:179:0x045e A[Catch: all -> 0x0239, TRY_ENTER, TryCatch #5 {all -> 0x0239, blocks: (B:84:0x0234, B:182:0x047e, B:179:0x045e), top: B:264:0x0213 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x047c  */
    /* JADX WARN: Code duplicated, block: B:187:0x048d  */
    /* JADX WARN: Code duplicated, block: B:194:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:228:0x058a  */
    /* JADX WARN: Code duplicated, block: B:231:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:235:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0153  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197 A[LOOP:0: B:69:0x0191->B:71:0x0197, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v143 */
    /* JADX WARN: Type inference failed for: r0v144 */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2, types: [lٍ٘ۢ] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v8 */
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
        Object c18435l;
        C17986l c17986l;
        Throwable thYandex;
        Object objFirebase;
        C17986l c17986l2;
        int i;
        Object c18435l2;
        Object c18435l3;
        Throwable thYandex2;
        AudioPlaylist audioPlaylist;
        C2975l c2975l;
        C14951l c14951l;
        ExecutorC6708l executorC6708l;
        C15559l c15559l;
        ?? r1;
        C8774l c8774l;
        InterfaceC14029l interfaceC14029l;
        ?? r2;
        Throwable thYandex3;
        ?? r0;
        C2975l c2975l2;
        C7864l c7864l;
        Throwable th;
        int i2;
        List list;
        C0228l c0228l;
        int i3;
        Object objAdmob;
        C7644l c7644lLoadAd;
        C17464l c17464l;
        int i4;
        C0228l c0228l2;
        List list2;
        C7644l c7644lLoadAd2;
        int i5;
        long j;
        int i6;
        C0228l c0228l3;
        Object c18435l4;
        C8195l c8195lCrashlytics;
        Object obj2;
        ?? r15;
        C12759l c12759l;
        int iIndexOf;
        int i7;
        C2975l c2975l3;
        C6658l c6658l;
        int i8;
        C12759l c12759l2;
        C8195l c8195l;
        int i9;
        ArrayList arrayList;
        Object objYandex;
        InterfaceC17817l interfaceC17817l;
        InterfaceC11805l c11392l;
        Object objPurchase;
        InterfaceC17817l interfaceC17817l2;
        InterfaceC17817l interfaceC17817l3;
        String str;
        InterfaceC8714l interfaceC8714l;
        Object objAmazon;
        C15417l c15417l = this;
        int i10 = c15417l.f30129l;
        ?? r3 = 10;
        String str2 = "call to 'resume' before 'invoke' with coroutine";
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i11 = 1;
        Throwable th2 = null;
        switch (i10) {
            case 0:
                int i12 = c15417l.f30131l;
                if (i12 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l = (InterfaceC2262l) c15417l.f30126l;
                    AbstractC12866l abstractC12866l = (AbstractC12866l) c15417l.f30127l;
                    Context context = (Context) c15417l.f30130l;
                    int i13 = c15417l.f30128l;
                    Bundle bundle = (Bundle) c15417l.f30132l;
                    c15417l.f30131l = 1;
                    if (abstractC12866l.crashlytics(interfaceC2262l, context, i13, bundle, c15417l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i12 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 1:
                int i14 = c15417l.f30131l;
                if (i14 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) c15417l.f30126l;
                    AbstractC12866l abstractC12866l2 = (AbstractC12866l) c15417l.f30127l;
                    Context context2 = (Context) c15417l.f30130l;
                    int i15 = c15417l.f30128l;
                    String str3 = (String) c15417l.f30132l;
                    c15417l.f30131l = 1;
                    if (abstractC12866l2.loadAd(interfaceC2262l2, context2, i15, str3, c15417l) == enumC9342l) {
                        return enumC9342l;
                    }
                } else {
                    if (i14 != 1) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(obj);
                }
                return Unit.INSTANCE;
            case 2:
                C17986l c17986l3 = (C17986l) c15417l.f30132l;
                int i16 = c15417l.f30128l;
                try {
                    if (i16 != 0) {
                        if (i16 == 1) {
                            int i17 = c15417l.f30131l;
                            c17986l2 = (C17986l) c15417l.f30126l;
                            AbstractC2829l.crashlytics(obj);
                            i = i17;
                            objFirebase = obj;
                        } else {
                            if (i16 == 2) {
                                AbstractC2829l.crashlytics(obj);
                                c18435l = Unit.INSTANCE;
                                if (!(c18435l instanceof C18435l)) {
                                    c17986l3.f35166l.setValue(EnumC1649l.f3992l);
                                    c15417l.f30130l = null;
                                    c15417l.f30126l = c18435l;
                                    c15417l.f30127l = c17986l3;
                                    c15417l.f30131l = 0;
                                    c15417l.f30128l = 3;
                                    if (AbstractC8532l.purchase(750L, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    c17986l = c17986l3;
                                }
                                thYandex = C1171l.yandex(c18435l);
                                if (thYandex != null) {
                                    thYandex.printStackTrace();
                                    c17986l3.f35166l.setValue(EnumC1649l.f3996l);
                                }
                                return Unit.INSTANCE;
                            }
                            if (i16 != 3) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c17986l = (C17986l) c15417l.f30127l;
                            c18435l = c15417l.f30126l;
                            AbstractC2829l.crashlytics(obj);
                        }
                        c17986l.purchase();
                        thYandex = C1171l.yandex(c18435l);
                        if (thYandex != null) {
                            thYandex.printStackTrace();
                            c17986l3.f35166l.setValue(EnumC1649l.f3996l);
                        }
                        return Unit.INSTANCE;
                    }
                    AbstractC2829l.crashlytics(obj);
                    c17986l3.f35166l.setValue(EnumC1649l.f3993l);
                    C16552l c16552l = AbstractC11463l.yandex;
                    ExecutorC6708l executorC6708l2 = ExecutorC6708l.f14063l;
                    C8912l c8912l = new C8912l(c17986l3, null, 15);
                    c15417l.f30130l = null;
                    c15417l.f30126l = c17986l3;
                    c15417l.f30127l = null;
                    c15417l.f30131l = 0;
                    c15417l.f30128l = 1;
                    objFirebase = AbstractC10999l.firebase(executorC6708l2, c8912l, c15417l);
                    if (objFirebase == enumC9342l) {
                        return enumC9342l;
                    }
                    c17986l2 = c17986l3;
                    i = 0;
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    C2975l c2975l4 = AbstractC17278l.yandex.f6462l;
                    C13624l c13624l = new C13624l(c17986l2, (List) objFirebase, null, 28);
                    c15417l.f30130l = null;
                    c15417l.f30126l = null;
                    c15417l.f30127l = null;
                    c15417l.f30131l = i;
                    c15417l.f30128l = 2;
                    if (AbstractC10999l.firebase(c2975l4, c13624l, c15417l) == enumC9342l) {
                        return enumC9342l;
                    }
                    c18435l = Unit.INSTANCE;
                } catch (Throwable th3) {
                    c18435l = new C18435l(th3);
                }
                if (!(c18435l instanceof C18435l)) {
                    c17986l3.f35166l.setValue(EnumC1649l.f3992l);
                    c15417l.f30130l = null;
                    c15417l.f30126l = c18435l;
                    c15417l.f30127l = c17986l3;
                    c15417l.f30131l = 0;
                    c15417l.f30128l = 3;
                    if (AbstractC8532l.purchase(750L, c15417l) == enumC9342l) {
                        return enumC9342l;
                    }
                    c17986l = c17986l3;
                    c17986l.purchase();
                }
                thYandex = C1171l.yandex(c18435l);
                if (thYandex != null) {
                    thYandex.printStackTrace();
                    c17986l3.f35166l.setValue(EnumC1649l.f3996l);
                }
                return Unit.INSTANCE;
            case 3:
                C0228l c0228l4 = (C0228l) c15417l.f30132l;
                AudioPlaylist audioPlaylist2 = c0228l4.f1204l;
                InterfaceC2262l interfaceC2262l3 = (InterfaceC2262l) c15417l.f30130l;
                try {
                    try {
                        switch (c15417l.f30128l) {
                            case 0:
                                AbstractC2829l.crashlytics(obj);
                                ArrayList arrayList2 = new ArrayList();
                                if (audioPlaylist2 != null) {
                                    int i18 = 0;
                                    for (Object obj3 : c0228l4.isVip()) {
                                        int i19 = i18 + 1;
                                        if (i18 < 0) {
                                            Throwable th4 = th2;
                                            AbstractC14055l.subscription();
                                            throw th4;
                                        }
                                        AudioTrack audioTrack = (AudioTrack) obj3;
                                        C12376l c12376l = c0228l4.f1205l;
                                        audioTrack.getClass();
                                        Throwable th5 = th2;
                                        C0228l c0228l5 = c0228l4;
                                        long j2 = audioTrack.crashlytics;
                                        int i20 = audioTrack.loadAd;
                                        EnumC11199l enumC11199l = (EnumC11199l) c12376l.get(AbstractC16676l.mopub(audioTrack));
                                        int i21 = enumC11199l == null ? -1 : AbstractC15227l.yandex[enumC11199l.ordinal()];
                                        if (i21 == -1) {
                                            Unit unit = Unit.INSTANCE;
                                        } else if (i21 == 1) {
                                            arrayList2.add(new C16832l(i20, j2, 0));
                                        } else if (i21 == 2) {
                                            arrayList2.add(new C16832l(i20, j2, -1));
                                        } else if (i21 != 3) {
                                            if (i21 != 4) {
                                                C18725l.billing();
                                                return th5;
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                        } else {
                                            arrayList2.add(new C16832l(i20, j2, i18));
                                        }
                                        i18 = i19;
                                        th2 = th5;
                                        c0228l4 = c0228l5;
                                    }
                                }
                                th = th2;
                                C0228l c0228l6 = c0228l4;
                                if (audioPlaylist2 != null) {
                                    try {
                                        C7644l c7644lLoadAd3 = AbstractC16584l.loadAd();
                                        int i22 = audioPlaylist2.crashlytics;
                                        long j3 = audioPlaylist2.amazon;
                                        String strApplovin = c0228l6.applovin();
                                        String strSignatures = c0228l6.signatures();
                                        Boolean boolValueOf = Boolean.valueOf(c0228l6.premium());
                                        c15417l.f30130l = interfaceC2262l3;
                                        c15417l.f30127l = arrayList2;
                                        c0228l4 = c0228l6;
                                        c15417l.f30126l = c0228l4;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 1;
                                        i2 = 4;
                                        try {
                                            Object objBilling = AbstractC14312l.billing(c7644lLoadAd3, i22, j3, strApplovin, strSignatures, boolValueOf, c15417l);
                                            c15417l = c15417l;
                                            if (objBilling == enumC9342l) {
                                                return enumC9342l;
                                            }
                                            list = arrayList2;
                                            c0228l = c0228l4;
                                            i3 = 0;
                                            if (c0228l.f1207l) {
                                                c7644lLoadAd = AbstractC16584l.loadAd();
                                                AudioPlaylist audioPlaylist3 = c0228l.f1204l;
                                                int i23 = audioPlaylist3.crashlytics;
                                                long j4 = audioPlaylist3.amazon;
                                                c15417l.f30130l = interfaceC2262l3;
                                                c15417l.f30127l = list;
                                                c15417l.f30126l = c0228l;
                                                c15417l.f30131l = i3;
                                                c15417l.f30128l = 2;
                                                c17464l = new C17464l("audio.deletePlaylistCoverPhoto", C2782l.f6062l);
                                                c17464l.loadAd(i23, "playlist_id");
                                                c17464l.crashlytics(j4, "owner_id");
                                                if (c7644lLoadAd.billing(c17464l, c15417l) == enumC9342l) {
                                                    return enumC9342l;
                                                }
                                            }
                                            i4 = i3;
                                            c0228l2 = c0228l;
                                            list2 = list;
                                            if (!list2.isEmpty()) {
                                                c7644lLoadAd2 = AbstractC16584l.loadAd();
                                                AudioPlaylist audioPlaylist4 = c0228l2.f1204l;
                                                i5 = audioPlaylist4.crashlytics;
                                                j = audioPlaylist4.amazon;
                                                c15417l.f30130l = interfaceC2262l3;
                                                c15417l.f30127l = th;
                                                c15417l.f30126l = c0228l2;
                                                c15417l.f30131l = i4;
                                                c15417l.f30128l = 3;
                                                if (AbstractC14312l.firebase(c7644lLoadAd2, i5, j, list2, c15417l) == enumC9342l) {
                                                    return enumC9342l;
                                                }
                                                i6 = i4;
                                                c0228l3 = c0228l2;
                                                i4 = i6;
                                                c0228l2 = c0228l3;
                                            }
                                            AudioPlaylist audioPlaylist5 = c0228l2.f1204l;
                                            C16534l c16534l = new C16534l(audioPlaylist5.amazon, audioPlaylist5.crashlytics, audioPlaylist5.pro);
                                            c15417l.f30130l = interfaceC2262l3;
                                            c15417l.f30127l = null;
                                            c15417l.f30126l = null;
                                            c15417l.f30131l = i4;
                                            c15417l.f30128l = i2;
                                            objAdmob = AbstractC8189l.admob(c16534l, c15417l);
                                            if (objAdmob == enumC9342l) {
                                                return enumC9342l;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            c15417l = c15417l;
                                            c18435l3 = new C18435l(th);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        c0228l4 = c0228l6;
                                    }
                                } else {
                                    c0228l4 = c0228l6;
                                    C16287l.yandex.getClass();
                                    Long l = new Long(C16287l.crashlytics());
                                    Boolean boolValueOf2 = Boolean.valueOf(c0228l4.premium());
                                    String strApplovin2 = c0228l4.applovin();
                                    String strSignatures2 = c0228l4.signatures();
                                    InterfaceC13238l interfaceC13238lIsVip = c0228l4.isVip();
                                    ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(interfaceC13238lIsVip, 10));
                                    Iterator it = interfaceC13238lIsVip.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(AbstractC16676l.billing((AudioTrack) it.next()));
                                    }
                                    C16534l c16534l2 = new C16534l(l, boolValueOf2, strApplovin2, strSignatures2, AbstractC16901l.m4240super(arrayList3));
                                    c15417l.f30130l = interfaceC2262l3;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30131l = 0;
                                    c15417l.f30128l = 5;
                                    objAdmob = AbstractC8189l.admob(c16534l2, c15417l);
                                    if (objAdmob == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                c18435l3 = (AudioPlaylist) objAdmob;
                                thYandex2 = C1171l.yandex(c18435l3);
                                if (thYandex2 != null) {
                                    thYandex2.printStackTrace();
                                }
                                if (c18435l3 instanceof C18435l) {
                                    c18435l3 = null;
                                }
                                audioPlaylist = (AudioPlaylist) c18435l3;
                                if (audioPlaylist != null) {
                                    if (c0228l4.f1209l != null) {
                                        C16552l c16552l3 = AbstractC11463l.yandex;
                                        executorC6708l = ExecutorC6708l.f14063l;
                                        c15559l = new C15559l(c0228l4, audioPlaylist, null, 29);
                                        c15417l.f30130l = null;
                                        c15417l.f30127l = null;
                                        c15417l.f30126l = audioPlaylist;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 6;
                                        if (AbstractC10999l.firebase(executorC6708l, c15559l, c15417l) == enumC9342l) {
                                            r1 = audioPlaylist;
                                            r3 = audioPlaylist;
                                            return enumC9342l;
                                        }
                                        r1 = audioPlaylist;
                                        r3 = audioPlaylist;
                                        c18435l2 = Unit.INSTANCE;
                                        r2 = r3;
                                        thYandex3 = C1171l.yandex(c18435l2);
                                        r1 = r2;
                                        if (thYandex3 != null) {
                                            thYandex3.printStackTrace();
                                            C15589l c15589l = C5013l.yandex;
                                            C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                            r1 = r2;
                                        }
                                    }
                                    r1 = audioPlaylist;
                                    ?? r4 = r1;
                                    C8490l c8490l = AbstractC6025l.yandex;
                                    c8774l = new C8774l(r4);
                                    interfaceC14029l = null;
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = r4;
                                    c15417l.f30128l = 7;
                                    r0 = r4;
                                    if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    C16552l c16552l4 = AbstractC11463l.yandex;
                                    c2975l2 = AbstractC17278l.yandex;
                                    c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                    c15417l.f30130l = interfaceC14029l;
                                    c15417l.f30127l = interfaceC14029l;
                                    c15417l.f30126l = interfaceC14029l;
                                    c15417l.f30128l = 8;
                                    if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l5 = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c14951l = new C14951l(c0228l4, null, 27);
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30128l = 9;
                                    if (AbstractC10999l.firebase(c2975l, c14951l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 1:
                                i3 = c15417l.f30131l;
                                c0228l = (C0228l) c15417l.f30126l;
                                list = (List) c15417l.f30127l;
                                AbstractC2829l.crashlytics(obj);
                                i2 = 4;
                                th = null;
                                if (c0228l.f1207l) {
                                    c7644lLoadAd = AbstractC16584l.loadAd();
                                    AudioPlaylist audioPlaylist6 = c0228l.f1204l;
                                    int i24 = audioPlaylist6.crashlytics;
                                    long j5 = audioPlaylist6.amazon;
                                    c15417l.f30130l = interfaceC2262l3;
                                    c15417l.f30127l = list;
                                    c15417l.f30126l = c0228l;
                                    c15417l.f30131l = i3;
                                    c15417l.f30128l = 2;
                                    c17464l = new C17464l("audio.deletePlaylistCoverPhoto", C2782l.f6062l);
                                    c17464l.loadAd(i24, "playlist_id");
                                    c17464l.crashlytics(j5, "owner_id");
                                    if (c7644lLoadAd.billing(c17464l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                i4 = i3;
                                c0228l2 = c0228l;
                                list2 = list;
                                if (!list2.isEmpty()) {
                                    c7644lLoadAd2 = AbstractC16584l.loadAd();
                                    AudioPlaylist audioPlaylist7 = c0228l2.f1204l;
                                    i5 = audioPlaylist7.crashlytics;
                                    j = audioPlaylist7.amazon;
                                    c15417l.f30130l = interfaceC2262l3;
                                    c15417l.f30127l = th;
                                    c15417l.f30126l = c0228l2;
                                    c15417l.f30131l = i4;
                                    c15417l.f30128l = 3;
                                    if (AbstractC14312l.firebase(c7644lLoadAd2, i5, j, list2, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    i6 = i4;
                                    c0228l3 = c0228l2;
                                    i4 = i6;
                                    c0228l2 = c0228l3;
                                }
                                AudioPlaylist audioPlaylist8 = c0228l2.f1204l;
                                C16534l c16534l3 = new C16534l(audioPlaylist8.amazon, audioPlaylist8.crashlytics, audioPlaylist8.pro);
                                c15417l.f30130l = interfaceC2262l3;
                                c15417l.f30127l = null;
                                c15417l.f30126l = null;
                                c15417l.f30131l = i4;
                                c15417l.f30128l = i2;
                                objAdmob = AbstractC8189l.admob(c16534l3, c15417l);
                                if (objAdmob == enumC9342l) {
                                    return enumC9342l;
                                }
                                c18435l3 = (AudioPlaylist) objAdmob;
                                thYandex2 = C1171l.yandex(c18435l3);
                                if (thYandex2 != null) {
                                    thYandex2.printStackTrace();
                                }
                                if (c18435l3 instanceof C18435l) {
                                    c18435l3 = null;
                                }
                                audioPlaylist = (AudioPlaylist) c18435l3;
                                if (audioPlaylist != null) {
                                    if (c0228l4.f1209l != null) {
                                        C16552l c16552l6 = AbstractC11463l.yandex;
                                        executorC6708l = ExecutorC6708l.f14063l;
                                        c15559l = new C15559l(c0228l4, audioPlaylist, null, 29);
                                        c15417l.f30130l = null;
                                        c15417l.f30127l = null;
                                        c15417l.f30126l = audioPlaylist;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 6;
                                        if (AbstractC10999l.firebase(executorC6708l, c15559l, c15417l) == enumC9342l) {
                                            r1 = audioPlaylist;
                                            r3 = audioPlaylist;
                                            return enumC9342l;
                                        }
                                        r1 = audioPlaylist;
                                        r3 = audioPlaylist;
                                        c18435l2 = Unit.INSTANCE;
                                        r2 = r3;
                                        thYandex3 = C1171l.yandex(c18435l2);
                                        r1 = r2;
                                        if (thYandex3 != null) {
                                            thYandex3.printStackTrace();
                                            C15589l c15589l2 = C5013l.yandex;
                                            C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                            r1 = r2;
                                        }
                                    }
                                    r1 = audioPlaylist;
                                    ?? r5 = r1;
                                    C8490l c8490l2 = AbstractC6025l.yandex;
                                    c8774l = new C8774l(r5);
                                    interfaceC14029l = null;
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = r5;
                                    c15417l.f30128l = 7;
                                    r0 = r5;
                                    if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    C16552l c16552l7 = AbstractC11463l.yandex;
                                    c2975l2 = AbstractC17278l.yandex;
                                    c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                    c15417l.f30130l = interfaceC14029l;
                                    c15417l.f30127l = interfaceC14029l;
                                    c15417l.f30126l = interfaceC14029l;
                                    c15417l.f30128l = 8;
                                    if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l8 = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c14951l = new C14951l(c0228l4, null, 27);
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30128l = 9;
                                    if (AbstractC10999l.firebase(c2975l, c14951l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 2:
                                i3 = c15417l.f30131l;
                                c0228l = (C0228l) c15417l.f30126l;
                                list = (List) c15417l.f30127l;
                                AbstractC2829l.crashlytics(obj);
                                i2 = 4;
                                th = null;
                                i4 = i3;
                                c0228l2 = c0228l;
                                list2 = list;
                                if (!list2.isEmpty()) {
                                    c7644lLoadAd2 = AbstractC16584l.loadAd();
                                    AudioPlaylist audioPlaylist9 = c0228l2.f1204l;
                                    i5 = audioPlaylist9.crashlytics;
                                    j = audioPlaylist9.amazon;
                                    c15417l.f30130l = interfaceC2262l3;
                                    c15417l.f30127l = th;
                                    c15417l.f30126l = c0228l2;
                                    c15417l.f30131l = i4;
                                    c15417l.f30128l = 3;
                                    if (AbstractC14312l.firebase(c7644lLoadAd2, i5, j, list2, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    i6 = i4;
                                    c0228l3 = c0228l2;
                                    i4 = i6;
                                    c0228l2 = c0228l3;
                                }
                                AudioPlaylist audioPlaylist10 = c0228l2.f1204l;
                                C16534l c16534l4 = new C16534l(audioPlaylist10.amazon, audioPlaylist10.crashlytics, audioPlaylist10.pro);
                                c15417l.f30130l = interfaceC2262l3;
                                c15417l.f30127l = null;
                                c15417l.f30126l = null;
                                c15417l.f30131l = i4;
                                c15417l.f30128l = i2;
                                objAdmob = AbstractC8189l.admob(c16534l4, c15417l);
                                if (objAdmob == enumC9342l) {
                                    return enumC9342l;
                                }
                                c18435l3 = (AudioPlaylist) objAdmob;
                                thYandex2 = C1171l.yandex(c18435l3);
                                if (thYandex2 != null) {
                                    thYandex2.printStackTrace();
                                }
                                if (c18435l3 instanceof C18435l) {
                                    c18435l3 = null;
                                }
                                audioPlaylist = (AudioPlaylist) c18435l3;
                                if (audioPlaylist != null) {
                                    if (c0228l4.f1209l != null) {
                                        C16552l c16552l9 = AbstractC11463l.yandex;
                                        executorC6708l = ExecutorC6708l.f14063l;
                                        c15559l = new C15559l(c0228l4, audioPlaylist, null, 29);
                                        c15417l.f30130l = null;
                                        c15417l.f30127l = null;
                                        c15417l.f30126l = audioPlaylist;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 6;
                                        if (AbstractC10999l.firebase(executorC6708l, c15559l, c15417l) == enumC9342l) {
                                            r1 = audioPlaylist;
                                            r3 = audioPlaylist;
                                            return enumC9342l;
                                        }
                                        r1 = audioPlaylist;
                                        r3 = audioPlaylist;
                                        c18435l2 = Unit.INSTANCE;
                                        r2 = r3;
                                        thYandex3 = C1171l.yandex(c18435l2);
                                        r1 = r2;
                                        if (thYandex3 != null) {
                                            thYandex3.printStackTrace();
                                            C15589l c15589l3 = C5013l.yandex;
                                            C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                            r1 = r2;
                                        }
                                    }
                                    r1 = audioPlaylist;
                                    ?? r6 = r1;
                                    C8490l c8490l3 = AbstractC6025l.yandex;
                                    c8774l = new C8774l(r6);
                                    interfaceC14029l = null;
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = r6;
                                    c15417l.f30128l = 7;
                                    r0 = r6;
                                    if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    C16552l c16552l10 = AbstractC11463l.yandex;
                                    c2975l2 = AbstractC17278l.yandex;
                                    c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                    c15417l.f30130l = interfaceC14029l;
                                    c15417l.f30127l = interfaceC14029l;
                                    c15417l.f30126l = interfaceC14029l;
                                    c15417l.f30128l = 8;
                                    if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l11 = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c14951l = new C14951l(c0228l4, null, 27);
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30128l = 9;
                                    if (AbstractC10999l.firebase(c2975l, c14951l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 3:
                                i6 = c15417l.f30131l;
                                c0228l3 = (C0228l) c15417l.f30126l;
                                AbstractC2829l.crashlytics(obj);
                                i2 = 4;
                                i4 = i6;
                                c0228l2 = c0228l3;
                                AudioPlaylist audioPlaylist11 = c0228l2.f1204l;
                                C16534l c16534l5 = new C16534l(audioPlaylist11.amazon, audioPlaylist11.crashlytics, audioPlaylist11.pro);
                                c15417l.f30130l = interfaceC2262l3;
                                c15417l.f30127l = null;
                                c15417l.f30126l = null;
                                c15417l.f30131l = i4;
                                c15417l.f30128l = i2;
                                objAdmob = AbstractC8189l.admob(c16534l5, c15417l);
                                if (objAdmob == enumC9342l) {
                                    return enumC9342l;
                                }
                                c18435l3 = (AudioPlaylist) objAdmob;
                                thYandex2 = C1171l.yandex(c18435l3);
                                if (thYandex2 != null) {
                                    thYandex2.printStackTrace();
                                }
                                if (c18435l3 instanceof C18435l) {
                                    c18435l3 = null;
                                }
                                audioPlaylist = (AudioPlaylist) c18435l3;
                                if (audioPlaylist != null) {
                                    if (c0228l4.f1209l != null) {
                                        C16552l c16552l12 = AbstractC11463l.yandex;
                                        executorC6708l = ExecutorC6708l.f14063l;
                                        c15559l = new C15559l(c0228l4, audioPlaylist, null, 29);
                                        c15417l.f30130l = null;
                                        c15417l.f30127l = null;
                                        c15417l.f30126l = audioPlaylist;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 6;
                                        if (AbstractC10999l.firebase(executorC6708l, c15559l, c15417l) == enumC9342l) {
                                            r1 = audioPlaylist;
                                            r3 = audioPlaylist;
                                            return enumC9342l;
                                        }
                                        r1 = audioPlaylist;
                                        r3 = audioPlaylist;
                                        c18435l2 = Unit.INSTANCE;
                                        r2 = r3;
                                        thYandex3 = C1171l.yandex(c18435l2);
                                        r1 = r2;
                                        if (thYandex3 != null) {
                                            thYandex3.printStackTrace();
                                            C15589l c15589l4 = C5013l.yandex;
                                            C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                            r1 = r2;
                                        }
                                    }
                                    r1 = audioPlaylist;
                                    ?? r7 = r1;
                                    C8490l c8490l4 = AbstractC6025l.yandex;
                                    c8774l = new C8774l(r7);
                                    interfaceC14029l = null;
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = r7;
                                    c15417l.f30128l = 7;
                                    r0 = r7;
                                    if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    C16552l c16552l13 = AbstractC11463l.yandex;
                                    c2975l2 = AbstractC17278l.yandex;
                                    c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                    c15417l.f30130l = interfaceC14029l;
                                    c15417l.f30127l = interfaceC14029l;
                                    c15417l.f30126l = interfaceC14029l;
                                    c15417l.f30128l = 8;
                                    if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l14 = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c14951l = new C14951l(c0228l4, null, 27);
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30128l = 9;
                                    if (AbstractC10999l.firebase(c2975l, c14951l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 4:
                                AbstractC2829l.crashlytics(obj);
                                objAdmob = obj;
                                c18435l3 = (AudioPlaylist) objAdmob;
                                thYandex2 = C1171l.yandex(c18435l3);
                                if (thYandex2 != null) {
                                    thYandex2.printStackTrace();
                                }
                                if (c18435l3 instanceof C18435l) {
                                    c18435l3 = null;
                                }
                                audioPlaylist = (AudioPlaylist) c18435l3;
                                if (audioPlaylist != null) {
                                    if (c0228l4.f1209l != null) {
                                        C16552l c16552l15 = AbstractC11463l.yandex;
                                        executorC6708l = ExecutorC6708l.f14063l;
                                        c15559l = new C15559l(c0228l4, audioPlaylist, null, 29);
                                        c15417l.f30130l = null;
                                        c15417l.f30127l = null;
                                        c15417l.f30126l = audioPlaylist;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 6;
                                        if (AbstractC10999l.firebase(executorC6708l, c15559l, c15417l) == enumC9342l) {
                                            r1 = audioPlaylist;
                                            r3 = audioPlaylist;
                                            return enumC9342l;
                                        }
                                        r1 = audioPlaylist;
                                        r3 = audioPlaylist;
                                        c18435l2 = Unit.INSTANCE;
                                        r2 = r3;
                                        thYandex3 = C1171l.yandex(c18435l2);
                                        r1 = r2;
                                        if (thYandex3 != null) {
                                            thYandex3.printStackTrace();
                                            C15589l c15589l5 = C5013l.yandex;
                                            C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                            r1 = r2;
                                        }
                                    }
                                    r1 = audioPlaylist;
                                    ?? r8 = r1;
                                    C8490l c8490l5 = AbstractC6025l.yandex;
                                    c8774l = new C8774l(r8);
                                    interfaceC14029l = null;
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = r8;
                                    c15417l.f30128l = 7;
                                    r0 = r8;
                                    if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    C16552l c16552l16 = AbstractC11463l.yandex;
                                    c2975l2 = AbstractC17278l.yandex;
                                    c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                    c15417l.f30130l = interfaceC14029l;
                                    c15417l.f30127l = interfaceC14029l;
                                    c15417l.f30126l = interfaceC14029l;
                                    c15417l.f30128l = 8;
                                    if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l17 = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c14951l = new C14951l(c0228l4, null, 27);
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30128l = 9;
                                    if (AbstractC10999l.firebase(c2975l, c14951l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 5:
                                AbstractC2829l.crashlytics(obj);
                                objAdmob = obj;
                                c18435l3 = (AudioPlaylist) objAdmob;
                                thYandex2 = C1171l.yandex(c18435l3);
                                if (thYandex2 != null) {
                                    thYandex2.printStackTrace();
                                }
                                if (c18435l3 instanceof C18435l) {
                                    c18435l3 = null;
                                }
                                audioPlaylist = (AudioPlaylist) c18435l3;
                                if (audioPlaylist != null) {
                                    if (c0228l4.f1209l != null) {
                                        C16552l c16552l18 = AbstractC11463l.yandex;
                                        executorC6708l = ExecutorC6708l.f14063l;
                                        c15559l = new C15559l(c0228l4, audioPlaylist, null, 29);
                                        c15417l.f30130l = null;
                                        c15417l.f30127l = null;
                                        c15417l.f30126l = audioPlaylist;
                                        c15417l.f30131l = 0;
                                        c15417l.f30128l = 6;
                                        if (AbstractC10999l.firebase(executorC6708l, c15559l, c15417l) == enumC9342l) {
                                            r1 = audioPlaylist;
                                            r3 = audioPlaylist;
                                            return enumC9342l;
                                        }
                                        r1 = audioPlaylist;
                                        r3 = audioPlaylist;
                                        c18435l2 = Unit.INSTANCE;
                                        r2 = r3;
                                        thYandex3 = C1171l.yandex(c18435l2);
                                        r1 = r2;
                                        if (thYandex3 != null) {
                                            thYandex3.printStackTrace();
                                            C15589l c15589l6 = C5013l.yandex;
                                            C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                            r1 = r2;
                                        }
                                    }
                                    r1 = audioPlaylist;
                                    ?? r9 = r1;
                                    C8490l c8490l6 = AbstractC6025l.yandex;
                                    c8774l = new C8774l(r9);
                                    interfaceC14029l = null;
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = r9;
                                    c15417l.f30128l = 7;
                                    r0 = r9;
                                    if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                    C16552l c16552l19 = AbstractC11463l.yandex;
                                    c2975l2 = AbstractC17278l.yandex;
                                    c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                    c15417l.f30130l = interfaceC14029l;
                                    c15417l.f30127l = interfaceC14029l;
                                    c15417l.f30126l = interfaceC14029l;
                                    c15417l.f30128l = 8;
                                    if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                } else {
                                    C16552l c16552l110 = AbstractC11463l.yandex;
                                    c2975l = AbstractC17278l.yandex;
                                    c14951l = new C14951l(c0228l4, null, 27);
                                    c15417l.f30130l = null;
                                    c15417l.f30127l = null;
                                    c15417l.f30126l = null;
                                    c15417l.f30128l = 9;
                                    if (AbstractC10999l.firebase(c2975l, c14951l, c15417l) == enumC9342l) {
                                        return enumC9342l;
                                    }
                                }
                                return Unit.INSTANCE;
                            case 6:
                                AudioPlaylist audioPlaylist12 = (AudioPlaylist) c15417l.f30126l;
                                AbstractC2829l.crashlytics(obj);
                                r3 = audioPlaylist12;
                                r1 = audioPlaylist;
                                r3 = audioPlaylist;
                                c18435l2 = Unit.INSTANCE;
                                r2 = r3;
                                thYandex3 = C1171l.yandex(c18435l2);
                                r1 = r2;
                                if (thYandex3 != null) {
                                    thYandex3.printStackTrace();
                                    C15589l c15589l7 = C5013l.yandex;
                                    C5013l.amazon(thYandex3, Collections.singletonMap("reason", "ppu_upload_failed"));
                                    r1 = r2;
                                }
                                r1 = audioPlaylist;
                                ?? r10 = r1;
                                C8490l c8490l7 = AbstractC6025l.yandex;
                                c8774l = new C8774l(r10);
                                interfaceC14029l = null;
                                c15417l.f30130l = null;
                                c15417l.f30127l = null;
                                c15417l.f30126l = r10;
                                c15417l.f30128l = 7;
                                r0 = r10;
                                if (AbstractC6025l.yandex(c8774l, c15417l) == enumC9342l) {
                                    return enumC9342l;
                                }
                                C16552l c16552l111 = AbstractC11463l.yandex;
                                c2975l2 = AbstractC17278l.yandex;
                                c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                c15417l.f30130l = interfaceC14029l;
                                c15417l.f30127l = interfaceC14029l;
                                c15417l.f30126l = interfaceC14029l;
                                c15417l.f30128l = 8;
                                if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                    return enumC9342l;
                                }
                                return Unit.INSTANCE;
                            case 7:
                                AudioPlaylist audioPlaylist13 = (AudioPlaylist) c15417l.f30126l;
                                AbstractC2829l.crashlytics(obj);
                                interfaceC14029l = null;
                                r0 = audioPlaylist13;
                                C16552l c16552l112 = AbstractC11463l.yandex;
                                c2975l2 = AbstractC17278l.yandex;
                                c7864l = new C7864l(c0228l4, (Object) r0, interfaceC14029l, i11);
                                c15417l.f30130l = interfaceC14029l;
                                c15417l.f30127l = interfaceC14029l;
                                c15417l.f30126l = interfaceC14029l;
                                c15417l.f30128l = 8;
                                if (AbstractC10999l.firebase(c2975l2, c7864l, c15417l) == enumC9342l) {
                                    return enumC9342l;
                                }
                                return Unit.INSTANCE;
                            case 8:
                            case 9:
                                AbstractC2829l.crashlytics(obj);
                                return Unit.INSTANCE;
                            default:
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    } catch (Throwable th8) {
                        c18435l2 = new C18435l(th8);
                        r2 = r3;
                    }
                } catch (Throwable th9) {
                    th = th9;
                }
                break;
            case 4:
                int i25 = c15417l.f30128l;
                C2580l c2580l = C2580l.f5619l;
                try {
                    if (i25 != 0) {
                        if (i25 == 1) {
                            InterfaceC17817l interfaceC17817l4 = (InterfaceC17817l) c15417l.f30130l;
                            c8195lCrashlytics = (C8195l) c15417l.f30127l;
                            AbstractC2829l.crashlytics(obj);
                            objPurchase = obj;
                            interfaceC17817l3 = interfaceC17817l4;
                        } else if (i25 == 2) {
                            i9 = c15417l.f30131l;
                            c12759l2 = (C12759l) c15417l.f30132l;
                            c8195l = (C8195l) c15417l.f30127l;
                            AbstractC2829l.crashlytics(obj);
                            C13042l.f25547l.yandex();
                            List<String> list3 = c12759l2.loadAd;
                            arrayList = new ArrayList(AbstractC14055l.billing(list3, 10));
                            for (String str4 : list3) {
                                C0935l c0935l = new C0935l();
                                C9258l c9258l = AbstractC1186l.f3181l;
                                C13708l c13708l = C13708l.f26763l;
                                List list4 = Collections.EMPTY_LIST;
                                C13708l c13708l2 = C13708l.f26763l;
                                C2410l c2410l = new C2410l();
                                C11470l c11470l = C11470l.amazon;
                                str4.getClass();
                                arrayList.add(new C2427l(str4, new C9202l(c0935l), null, new C7828l(c2410l), C3852l.f7980private, c11470l));
                            }
                            C9673l c9673l = new C9673l(21);
                            c15417l.f30126l = null;
                            c15417l.f30127l = c8195l;
                            c15417l.f30130l = null;
                            c15417l.f30132l = null;
                            c15417l.f30131l = i9;
                            c15417l.f30128l = 3;
                            objYandex = C5406l.yandex.yandex(arrayList, c9673l);
                            if (objYandex == enumC9342l) {
                                return enumC9342l;
                            }
                        } else {
                            if (i25 != 3) {
                                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i9 = c15417l.f30131l;
                            C8195l c8195l2 = (C8195l) c15417l.f30127l;
                            AbstractC2829l.crashlytics(obj);
                            c8195l = c8195l2;
                            objYandex = obj;
                        }
                        return new C9896l(i9, ((C0767l) c8195l.f17098l).loadAd.amazon, (List) objYandex);
                    }
                    AbstractC2829l.crashlytics(obj);
                    C13042l.f25547l.getClass();
                    if (!C13042l.loadAd()) {
                        return new C9896l(0, 0L, c2580l);
                    }
                    c8195lCrashlytics = C13042l.crashlytics();
                    if (c8195lCrashlytics == null) {
                        return new C9896l(0, 0L, c2580l);
                    }
                    Object obj4 = c8195lCrashlytics.f17098l;
                    InterfaceC3136l interfaceC3136l = ((C0767l) obj4).yandex;
                    if (interfaceC3136l instanceof InterfaceC17817l) {
                        interfaceC17817l2 = (InterfaceC17817l) interfaceC3136l;
                    } else {
                        interfaceC17817l = null;
                    }
                    if (interfaceC17817l == null) {
                        interfaceC17817l = interfaceC17817l2;
                        return new C9896l(0, 0L, c2580l);
                    }
                    QueueSaveHolder$VkxMetadataState queueSaveHolder$VkxMetadataState = (QueueSaveHolder$VkxMetadataState) c8195lCrashlytics.f17097l;
                    if (queueSaveHolder$VkxMetadataState != null) {
                        interfaceC17817l = interfaceC17817l2;
                        c18435l4 = new C12759l(queueSaveHolder$VkxMetadataState.yandex(), queueSaveHolder$VkxMetadataState.yandex, false);
                        obj2 = interfaceC17817l;
                    } else {
                        C17539l c17539l = C17539l.yandex;
                        String str5 = ((C0767l) obj4).loadAd.yandex;
                        if (str5 != null) {
                            interfaceC17817l = interfaceC17817l2;
                            c11392l = new C11392l(str5);
                        } else {
                            interfaceC17817l = interfaceC17817l2;
                            c11392l = C4618l.yandex;
                        }
                        C13305l c13305l = new C13305l(c11392l, 0L, null, false, false, false, 126);
                        c15417l.f30126l = null;
                        c15417l.f30127l = c8195lCrashlytics;
                        c15417l.f30130l = interfaceC17817l;
                        c15417l.f30132l = null;
                        c15417l.f30131l = 0;
                        c15417l.f30128l = 1;
                        objPurchase = c17539l.purchase(interfaceC17817l, c13305l, c15417l);
                        interfaceC17817l3 = interfaceC17817l;
                        if (objPurchase == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    r15 = obj2;
                    if (C1171l.yandex(c18435l4) == null) {
                        return new C9896l(0, 0L, c2580l);
                    }
                    c12759l = (C12759l) c18435l4;
                    iIndexOf = c12759l.loadAd.indexOf(((C0767l) c8195lCrashlytics.f17098l).loadAd.yandex);
                    if (iIndexOf < 0) {
                        i7 = 0;
                    } else {
                        i7 = iIndexOf;
                    }
                    C16552l c16552l20 = AbstractC11463l.yandex;
                    c2975l3 = AbstractC17278l.yandex;
                    c6658l = new C6658l((InterfaceC17817l) r15, c12759l, i7, c8195lCrashlytics, (InterfaceC14029l) null);
                    i8 = i7;
                    c15417l.f30126l = null;
                    c15417l.f30127l = c8195lCrashlytics;
                    c15417l.f30130l = null;
                    c15417l.f30132l = c12759l;
                    c15417l.f30131l = i8;
                    c15417l.f30128l = 2;
                    if (AbstractC10999l.firebase(c2975l3, c6658l, c15417l) == enumC9342l) {
                        return enumC9342l;
                    }
                    c12759l2 = c12759l;
                    c8195l = c8195lCrashlytics;
                    i9 = i8;
                    C13042l.f25547l.yandex();
                    List<String> list5 = c12759l2.loadAd;
                    arrayList = new ArrayList(AbstractC14055l.billing(list5, 10));
                    while (r1.hasNext()) {
                        C0935l c0935l2 = new C0935l();
                        C9258l c9258l2 = AbstractC1186l.f3181l;
                        C13708l c13708l3 = C13708l.f26763l;
                        List list6 = Collections.EMPTY_LIST;
                        C13708l c13708l4 = C13708l.f26763l;
                        C2410l c2410l2 = new C2410l();
                        C11470l c11470l2 = C11470l.amazon;
                        str4.getClass();
                        arrayList.add(new C2427l(str4, new C9202l(c0935l2), null, new C7828l(c2410l2), C3852l.f7980private, c11470l2));
                    }
                    C9673l c9673l2 = new C9673l(21);
                    c15417l.f30126l = null;
                    c15417l.f30127l = c8195l;
                    c15417l.f30130l = null;
                    c15417l.f30132l = null;
                    c15417l.f30131l = i9;
                    c15417l.f30128l = 3;
                    objYandex = C5406l.yandex.yandex(arrayList, c9673l2);
                    if (objYandex == enumC9342l) {
                        return enumC9342l;
                    }
                    return new C9896l(i9, ((C0767l) c8195l.f17098l).loadAd.amazon, (List) objYandex);
                    c18435l4 = (C12759l) objPurchase;
                    obj2 = interfaceC17817l3;
                } catch (Throwable th10) {
                    c18435l4 = new C18435l(th10);
                    obj2 = str2;
                }
                r15 = obj2;
                if (C1171l.yandex(c18435l4) == null) {
                    return new C9896l(0, 0L, c2580l);
                }
                c12759l = (C12759l) c18435l4;
                iIndexOf = c12759l.loadAd.indexOf(((C0767l) c8195lCrashlytics.f17098l).loadAd.yandex);
                if (iIndexOf < 0) {
                    i7 = 0;
                } else {
                    i7 = iIndexOf;
                }
                C16552l c16552l21 = AbstractC11463l.yandex;
                c2975l3 = AbstractC17278l.yandex;
                c6658l = new C6658l((InterfaceC17817l) r15, c12759l, i7, c8195lCrashlytics, (InterfaceC14029l) null);
                i8 = i7;
                c15417l.f30126l = null;
                c15417l.f30127l = c8195lCrashlytics;
                c15417l.f30130l = null;
                c15417l.f30132l = c12759l;
                c15417l.f30131l = i8;
                c15417l.f30128l = 2;
                if (AbstractC10999l.firebase(c2975l3, c6658l, c15417l) == enumC9342l) {
                    return enumC9342l;
                }
                c12759l2 = c12759l;
                c8195l = c8195lCrashlytics;
                i9 = i8;
                C13042l.f25547l.yandex();
                List<String> list7 = c12759l2.loadAd;
                arrayList = new ArrayList(AbstractC14055l.billing(list7, 10));
                while (r1.hasNext()) {
                    C0935l c0935l3 = new C0935l();
                    C9258l c9258l3 = AbstractC1186l.f3181l;
                    C13708l c13708l5 = C13708l.f26763l;
                    List list8 = Collections.EMPTY_LIST;
                    C13708l c13708l6 = C13708l.f26763l;
                    C2410l c2410l3 = new C2410l();
                    C11470l c11470l3 = C11470l.amazon;
                    str4.getClass();
                    arrayList.add(new C2427l(str4, new C9202l(c0935l3), null, new C7828l(c2410l3), C3852l.f7980private, c11470l3));
                }
                C9673l c9673l3 = new C9673l(21);
                c15417l.f30126l = null;
                c15417l.f30127l = c8195l;
                c15417l.f30130l = null;
                c15417l.f30132l = null;
                c15417l.f30131l = i9;
                c15417l.f30128l = 3;
                objYandex = C5406l.yandex.yandex(arrayList, c9673l3);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                return new C9896l(i9, ((C0767l) c8195l.f17098l).loadAd.amazon, (List) objYandex);
            default:
                int i26 = c15417l.f30131l;
                if (i26 == 0) {
                    AbstractC2829l.crashlytics(obj);
                    C0884l c0884l = (C0884l) c15417l.f30127l;
                    if (c0884l != null && (str = c0884l.f2537l) != null) {
                        Context context3 = (Context) c15417l.f30130l;
                        int i27 = c15417l.f30128l;
                        interfaceC8714l = (InterfaceC8714l) c15417l.f30132l;
                        c15417l.f30126l = interfaceC8714l;
                        c15417l.f30131l = 1;
                        objAmazon = AbstractC13542l.amazon(context3, str, 300, i27, false, c15417l, 8);
                        if (objAmazon == enumC9342l) {
                            return enumC9342l;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i26 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) c15417l.f30126l;
                AbstractC2829l.crashlytics(obj);
                interfaceC8714l = interfaceC8714l2;
                objAmazon = obj;
                interfaceC8714l.setValue((Bitmap) objAmazon);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = 2;
        switch (this.f30129l) {
            case 0:
                C15417l c15417l = new C15417l((AbstractC12866l) this.f30127l, (Context) this.f30130l, this.f30128l, (Bundle) this.f30132l, interfaceC14029l, 0);
                c15417l.f30126l = obj;
                return c15417l;
            case 1:
                C15417l c15417l2 = new C15417l((AbstractC12866l) this.f30127l, (Context) this.f30130l, this.f30128l, (String) this.f30132l, interfaceC14029l, 1);
                c15417l2.f30126l = obj;
                return c15417l2;
            case 2:
                C15417l c15417l3 = new C15417l((C17986l) this.f30132l, interfaceC14029l, i);
                c15417l3.f30130l = obj;
                return c15417l3;
            case 3:
                C15417l c15417l4 = new C15417l((C0228l) this.f30132l, interfaceC14029l, 3);
                c15417l4.f30130l = obj;
                return c15417l4;
            case 4:
                C15417l c15417l5 = new C15417l(i, interfaceC14029l);
                c15417l5.f30126l = obj;
                return c15417l5;
            default:
                return new C15417l((C0884l) this.f30127l, (Context) this.f30130l, this.f30128l, (InterfaceC8714l) this.f30132l, interfaceC14029l, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f30129l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C15417l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15417l(AbstractC5097l abstractC5097l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f30129l = i;
        this.f30132l = abstractC5097l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15417l(int i, InterfaceC14029l interfaceC14029l) {
        super(i, interfaceC14029l);
        this.f30129l = 4;
    }
}
