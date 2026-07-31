package defpackage;

import android.content.Context;
import android.graphics.CornerPathEffect;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lٌ٘۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C17796l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f34661l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34662l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34663l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f34664l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f34665l;

    public /* synthetic */ C17796l(InterfaceC13349l interfaceC13349l, C0404l c0404l, InterfaceC12244l interfaceC12244l, C9459l c9459l) {
        this.f34663l = 15;
        this.f34662l = interfaceC13349l;
        this.f34665l = c0404l;
        this.f34661l = interfaceC12244l;
        this.f34664l = c9459l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v94, types: [lٌْٙ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [lٌْٙ] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List, lٌْٙ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [int] */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r6v151, types: [java.lang.Object, lٌْٙ] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, lٌْٙ] */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        Object c18435l;
        int i = 29;
        int i2 = 6;
        int i3 = 5;
        char c = ' ';
        int i4 = 4;
        int i5 = 3;
        final int i6 = 2;
        int i7 = 1;
        final ?? r3 = 0;
        int i8 = 0;
        switch (this.f34663l) {
            case 0:
                C9231l c9231l = (C9231l) this.f34662l;
                InterfaceC12244l interfaceC12244l = (InterfaceC12244l) this.f34661l;
                C0324l c0324l = (C0324l) this.f34664l;
                InterfaceC12244l interfaceC12244l2 = (InterfaceC12244l) this.f34665l;
                C1336l c1336l = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1927829525, true, new C1350l(i6, c9231l)), 3);
                ?? r1 = (InterfaceC13238l) interfaceC12244l.getValue();
                C15056l c15056l = C15056l.f29579l;
                c1336l.firebase(((AbstractC7095l) r1).pro(), new C5640l(r1, 0), new C5640l(r1, 1, r3), new C15578l(802480018, true, new C18125l(r1, c0324l, r3)));
                if (((Boolean) interfaceC12244l2.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l, null, null, new C15578l(1179480496, true, new C0461l(c0324l, r3)), 3);
                }
                return Unit.INSTANCE;
            case 1:
                C5616l c5616l = (C5616l) this.f34662l;
                C6570l c6570l = (C6570l) this.f34661l;
                Function1 function1 = (Function1) this.f34665l;
                C9122l c9122l = (C9122l) this.f34664l;
                C14734l c14734l = (C14734l) obj;
                C6570l c6570l2 = c5616l.crashlytics;
                AbstractC18719l.remoteconfig(c14734l, c6570l2);
                C10086l c10086l = c14734l.purchase;
                Object objCrashlytics = c5616l.crashlytics(c10086l.getValue());
                if (!AbstractC8576l.yandex(objCrashlytics, c10086l.getValue())) {
                    c6570l2.f13720l.setValue(objCrashlytics);
                    c6570l.f13720l.setValue(objCrashlytics);
                    if (function1 != null) {
                        function1.invoke(c5616l);
                    }
                    c14734l.yandex();
                    c9122l.f18750l = true;
                } else if (function1 != null) {
                    function1.invoke(c5616l);
                }
                return Unit.INSTANCE;
            case 2:
                List list = (List) this.f34662l;
                ((C1336l) obj).firebase(list.size(), null, new Creturn(list, 4, false), new C15578l(802480018, true, new C2414l(list, (Function0) this.f34661l, (Context) this.f34665l, (List) this.f34664l)));
                return Unit.INSTANCE;
            case 3:
                C17812l c17812l = (C17812l) this.f34662l;
                C8877l c8877l = (C8877l) this.f34661l;
                C0639l c0639l = (C0639l) this.f34665l;
                C14966l c14966l = (C14966l) this.f34664l;
                if (c17812l.loadAd()) {
                    C18595l c18595l = c17812l.amazon;
                    C10403l c10403l = c17812l.license;
                    C10403l c10403l2 = c17812l.pro;
                    C10700l c10700l = new C10700l();
                    C6411l c6411l = new C6411l(c18595l, c10403l, c10700l, 11);
                    InterfaceC14081l interfaceC14081l = c8877l.yandex;
                    interfaceC14081l.crashlytics(c0639l, c14966l, c6411l, c10403l2);
                    C12983l c12983l = new C12983l(c8877l, interfaceC14081l);
                    c8877l.loadAd.set(c12983l);
                    c10700l.f21708l = c12983l;
                    c17812l.purchase = c12983l;
                }
                return new C2714l(4);
            case 4:
                C11362l c11362l = (C11362l) this.f34662l;
                ?? r2 = (InterfaceC13238l) this.f34661l;
                final C17136l c17136l = (C17136l) this.f34665l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f34664l;
                C1336l c1336l2 = (C1336l) obj;
                final int i9 = 1;
                AbstractC1757l.appmetrica(c1336l2, null, new C8241l(i6), new C15578l(-444843423, true, new Function3() { // from class: lًؔ٘
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
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i10 = r3;
                        C17136l c17136l2 = c17136l;
                        C6956l c6956l = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i10) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c17136l2.m4269finally(AbstractC11999l.purchase(c6956l, R.string.eq2_presets_category_custom), c6956l, 0);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c17136l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == C1867l.yandex) {
                                        objM2132native = new C12235l(c17136l2, 2);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    c17136l2.m4271instanceof((Function0) objM2132native, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), c6956l, 48);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c17136l2.m4269finally(AbstractC11999l.purchase(c6956l, R.string.eq2_presets_category_prebuilt), c6956l, 0);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 1);
                AbstractC1757l.appmetrica(c1336l2, null, null, new C15578l(2088337944, true, new Function3() { // from class: lًؔ٘
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
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i10 = i9;
                        C17136l c17136l2 = c17136l;
                        C6956l c6956l = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i10) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c17136l2.m4269finally(AbstractC11999l.purchase(c6956l, R.string.eq2_presets_category_custom), c6956l, 0);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c17136l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == C1867l.yandex) {
                                        objM2132native = new C12235l(c17136l2, 2);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    c17136l2.m4271instanceof((Function0) objM2132native, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), c6956l, 48);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c17136l2.m4269finally(AbstractC11999l.purchase(c6956l, R.string.eq2_presets_category_prebuilt), c6956l, 0);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 3);
                C13298l c13298l = C13298l.f26099l;
                int i10 = 1;
                c1336l2.firebase(c11362l.size(), new Creturn(26, c11362l), new C16026l(new C4741l(20), c11362l, r3), new C15578l(802480018, true, new C12264l(c11362l, c17136l, interfaceC8714l, r3)));
                AbstractC1757l.appmetrica(c1336l2, null, new C8241l(i6), new C15578l(857045401, true, new Function3() { // from class: lًؔ٘
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
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        int i11 = i6;
                        C17136l c17136l2 = c17136l;
                        C6956l c6956l = (C6956l) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        switch (i11) {
                            case 0:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c17136l2.m4269finally(AbstractC11999l.purchase(c6956l, R.string.eq2_presets_category_custom), c6956l, 0);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            case 1:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    boolean zAdmob = c6956l.admob(c17136l2);
                                    Object objM2132native = c6956l.m2132native();
                                    if (zAdmob || objM2132native == C1867l.yandex) {
                                        objM2132native = new C12235l(c17136l2, 2);
                                        c6956l.m2147try(objM2132native);
                                    }
                                    c17136l2.m4271instanceof((Function0) objM2132native, AbstractC0080l.amazon(C4346l.f8873l, 1.0f), c6956l, 48);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                            default:
                                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    c17136l2.m4269finally(AbstractC11999l.purchase(c6956l, R.string.eq2_presets_category_prebuilt), c6956l, 0);
                                } else {
                                    c6956l.m2124else();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 1);
                C9451l c9451l = C9451l.f19312l;
                c1336l2.firebase(((AbstractC7095l) r2).pro(), new Creturn(27, r2), new C16026l(new C4741l(20), r2, i10), new C15578l(802480018, true, new C12264l(r2, c17136l, interfaceC8714l, i10)));
                return Unit.INSTANCE;
            case 5:
                Function0 function0 = (Function0) this.f34662l;
                Function1 function2 = (Function1) this.f34661l;
                C11359l c11359l = (C11359l) this.f34665l;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f34664l;
                if (((C0639l) interfaceC8714l2.getValue()).yandex.f7563l.length() > 0) {
                    function0.invoke();
                    function2.invoke(C11359l.yandex(c11359l, null, ((C0639l) interfaceC8714l2.getValue()).yandex.f7563l, 29));
                }
                return Unit.INSTANCE;
            case 6:
                C4595l c4595l = (C4595l) this.f34662l;
                String str = (String) this.f34661l;
                String str2 = (String) this.f34665l;
                C16033l c16033l = (C16033l) this.f34664l;
                C16221l c16221l = (C16221l) obj;
                c4595l.getClass();
                C16033l c16033l2 = C4595l.amazon;
                Object objCrashlytics2 = c16221l.crashlytics(c16033l2);
                if (((String) (objCrashlytics2 != null ? objCrashlytics2 : "")).equals(str)) {
                    C16033l c16033lPurchase = c4595l.purchase(c16221l, str);
                    if (c16033lPurchase != null && !c16033lPurchase.yandex.equals(str2)) {
                        synchronized (c4595l) {
                            c4595l.admob(c16221l, str);
                            Object hashSet = new HashSet();
                            Object objCrashlytics3 = c16221l.crashlytics(c16033l);
                            if (objCrashlytics3 != null) {
                                hashSet = objCrashlytics3;
                            }
                            HashSet hashSet2 = new HashSet((Collection) hashSet);
                            hashSet2.add(str);
                            c16221l.amazon(c16033l, hashSet2);
                        }
                    }
                } else {
                    C16033l c16033l3 = C4595l.crashlytics;
                    Object objCrashlytics4 = c16221l.crashlytics(c16033l3);
                    long jLongValue = ((Long) (objCrashlytics4 != null ? objCrashlytics4 : 0L)).longValue();
                    if (jLongValue + 1 == 30) {
                        jLongValue = c4595l.yandex(c16221l);
                    }
                    Object hashSet3 = new HashSet();
                    Object objCrashlytics5 = c16221l.crashlytics(c16033l);
                    if (objCrashlytics5 != null) {
                        hashSet3 = objCrashlytics5;
                    }
                    HashSet hashSet4 = new HashSet((Collection) hashSet3);
                    hashSet4.add(str);
                    c16221l.amazon(c16033l, hashSet4);
                    c16221l.amazon(c16033l3, Long.valueOf(jLongValue + 1));
                    c16221l.amazon(c16033l2, str);
                }
                return null;
            case 7:
                InterfaceC8714l interfaceC8714l3 = (InterfaceC8714l) this.f34662l;
                C13138l c13138l = (C13138l) this.f34661l;
                C13250l c13250l = (C13250l) this.f34665l;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f34664l;
                long jLongValue2 = ((Long) obj).longValue();
                InterfaceC12244l interfaceC12244l3 = (InterfaceC12244l) interfaceC8714l3.getValue();
                long jLongValue3 = interfaceC12244l3 != null ? ((Number) interfaceC12244l3.getValue()).longValue() : jLongValue2;
                long j = c13138l.crashlytics;
                C17893l c17893l = c13138l.yandex;
                if (j == Long.MIN_VALUE || c13250l.f26029l != AbstractC18719l.isPro(interfaceC2262l.vip())) {
                    c13138l.crashlytics = jLongValue2;
                    Object[] objArr = c17893l.f34848l;
                    int i11 = c17893l.f34846l;
                    for (int i12 = 0; i12 < i11; i12++) {
                        ((C8456l) objArr[i12]).f17485l = true;
                    }
                    c13250l.f26029l = AbstractC18719l.isPro(interfaceC2262l.vip());
                }
                float f = c13250l.f26029l;
                if (f == 0.0f) {
                    Object[] objArr2 = c17893l.f34848l;
                    int i13 = c17893l.f34846l;
                    while (r3 < i13) {
                        C8456l c8456l = (C8456l) objArr2[r3];
                        c8456l.f17490l.setValue(c8456l.f17489l.crashlytics);
                        c8456l.f17485l = true;
                        r3++;
                    }
                } else {
                    long j2 = (long) ((jLongValue3 - c13138l.crashlytics) / f);
                    Object[] objArr3 = c17893l.f34848l;
                    int i14 = c17893l.f34846l;
                    boolean z = true;
                    for (int i15 = 0; i15 < i14; i15++) {
                        C8456l c8456l2 = (C8456l) objArr3[i15];
                        if (!c8456l2.f17492l) {
                            c8456l2.f17491l.loadAd.setValue(Boolean.FALSE);
                            if (c8456l2.f17485l) {
                                c8456l2.f17485l = false;
                                c8456l2.f17486l = j2;
                            }
                            long j3 = j2 - c8456l2.f17486l;
                            c8456l2.f17490l.setValue(c8456l2.f17489l.billing(j3));
                            C5810l c5810l = c8456l2.f17489l;
                            c5810l.getClass();
                            c8456l2.f17492l = AbstractC5020l.purchase(c5810l, j3);
                        }
                        if (!c8456l2.f17492l) {
                            z = false;
                        }
                    }
                    c13138l.amazon.setValue(Boolean.valueOf(!z));
                }
                return Unit.INSTANCE;
            case 8:
                List list2 = (List) this.f34662l;
                C9987l c9987l = (C9987l) this.f34661l;
                List list3 = (List) this.f34665l;
                C13217l c13217l = (C13217l) this.f34664l;
                C11045l c11045l = (C11045l) obj;
                InterfaceC6797l interfaceC6797l = c11045l.purchase;
                int iAmazon = interfaceC6797l != null ? interfaceC6797l.amazon() : 0;
                int iCrashlytics = 0;
                for (int i16 = 0; i16 < iAmazon; i16++) {
                    EnumC7283l enumC7283l = c13217l.adcel;
                    EnumC7283l enumC7283l2 = EnumC7283l.f15126l;
                    InterfaceC6797l interfaceC6797l2 = c11045l.purchase;
                    iCrashlytics += (int) (enumC7283l == enumC7283l2 ? (interfaceC6797l2 != null ? interfaceC6797l2.crashlytics(i16) : 0L) & 4294967295L : (interfaceC6797l2 != null ? interfaceC6797l2.crashlytics(i16) : 0L) >> 32);
                }
                if (list2 != null) {
                    list2.add(Integer.valueOf(iCrashlytics));
                }
                if (c9987l.f20387l != list3.size()) {
                    c9987l.f20387l++;
                }
                return Unit.INSTANCE;
            case 9:
                C14541l c14541l = (C14541l) this.f34662l;
                c14541l.crashlytics = new C11919l((C10554l) this.f34661l, (C2768l) this.f34665l, (InterfaceC1160l) this.f34664l);
                return new C9582l(12, c14541l);
            case 10:
                C0228l c0228l = (C0228l) this.f34662l;
                C16307l c16307l = (C16307l) this.f34661l;
                C5056l c5056l = (C5056l) this.f34665l;
                InterfaceC1234l interfaceC1234l = (InterfaceC1234l) this.f34664l;
                C1336l c1336l3 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l3, "_synth_heading", null, new C15578l(-1999638024, true, new C8956l(c0228l, c16307l)), 2);
                AbstractC1757l.appmetrica(c1336l3, "_synth_heading_2", null, new C15578l(2048587247, true, new C1350l(i, c0228l)), 2);
                ?? IsVip = c0228l.isVip();
                int i17 = C14653l.f28670l;
                c1336l3.firebase(((AbstractC7095l) IsVip).pro(), new C5640l(IsVip, 5), new C5640l(IsVip, i2, r3), new C15578l(802480018, true, new C2414l(IsVip, c0228l, c5056l, interfaceC1234l, 3)));
                return Unit.INSTANCE;
            case 11:
                C16625l c16625l = (C16625l) this.f34662l;
                Function0 function3 = (Function0) this.f34661l;
                Function0 function4 = (Function0) this.f34665l;
                C4480l c4480l = (C4480l) this.f34664l;
                InterfaceC13349l interfaceC13349l = (InterfaceC13349l) obj;
                List list4 = (List) function3.invoke();
                List list5 = (List) function4.invoke();
                long jAdmob = interfaceC13349l.admob();
                float[] fArr = c16625l.loadAd;
                C14386l c14386l = c16625l.yandex;
                for (int i18 = c14386l.crashlytics; i8 < i18; i18 = i18) {
                    int i19 = c14386l.amazon[i8];
                    int i20 = c14386l.purchase[i8];
                    int i21 = c14386l.billing[i8];
                    char c2 = c;
                    int i22 = c14386l.mopub[i8];
                    int i23 = i7;
                    float f2 = c14386l.admob[i8];
                    int i24 = i8;
                    float f3 = c14386l.subs[i24];
                    InterfaceC13349l interfaceC13349l2 = interfaceC13349l;
                    long j4 = jAdmob;
                    long j5 = ((C1187l) list4.get(i19)).yandex;
                    long j6 = ((C1187l) list4.get(i20)).yandex;
                    long j7 = ((C1187l) list4.get(i21)).yandex;
                    long j8 = ((C1187l) list4.get(i22)).yandex;
                    int i25 = (int) (j5 >> c2);
                    float fIntBitsToFloat = ((Float.intBitsToFloat((int) (j6 >> c2)) - Float.intBitsToFloat(i25)) * f2) + Float.intBitsToFloat(i25);
                    int i26 = (int) (j5 & 4294967295L);
                    float fIntBitsToFloat2 = ((Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat(i26)) * f2) + Float.intBitsToFloat(i26);
                    float[] fArr2 = fArr;
                    C14386l c14386l2 = c14386l;
                    int i27 = (int) (j7 >> c2);
                    float fIntBitsToFloat3 = ((Float.intBitsToFloat((int) (j8 >> c2)) - Float.intBitsToFloat(i27)) * f2) + Float.intBitsToFloat(i27);
                    int i28 = (int) (j7 & 4294967295L);
                    float fIntBitsToFloat4 = ((Float.intBitsToFloat((int) (j8 & 4294967295L)) - Float.intBitsToFloat(i28)) * f2) + Float.intBitsToFloat(i28);
                    float fSignature = AbstractC4338l.Signature(fIntBitsToFloat3, fIntBitsToFloat, f3, fIntBitsToFloat);
                    float fSignature2 = AbstractC4338l.Signature(fIntBitsToFloat4, fIntBitsToFloat2, f3, fIntBitsToFloat2);
                    int i29 = i24 * 2;
                    fArr2[i29] = Float.intBitsToFloat((int) (j4 >> c2)) * fSignature;
                    fArr2[i29 + 1] = Float.intBitsToFloat((int) (j4 & 4294967295L)) * fSignature2;
                    c16625l.crashlytics[i24] = AbstractC12953l.remoteconfig(AbstractC12953l.remoteconfig(((C9735l) list5.get(i19)).yandex, ((C9735l) list5.get(i20)).yandex, f2), AbstractC12953l.remoteconfig(((C9735l) list5.get(i21)).yandex, ((C9735l) list5.get(i22)).yandex, f2), f3);
                    i8 = i24 + 1;
                    interfaceC13349l = interfaceC13349l2;
                    fArr = fArr2;
                    c14386l = c14386l2;
                    c = c2;
                    i7 = i23;
                    jAdmob = j4;
                }
                InterfaceC14859l interfaceC14859lM4555synchronized = interfaceC13349l.mo2065break().m4555synchronized();
                C1028l c1028l = c16625l.amazon;
                interfaceC14859lM4555synchronized.vip(new C1381l(c1028l, c1028l, c16625l.purchase, (List) c16625l.billing), c4480l);
                return Unit.INSTANCE;
            case 12:
                C13250l c13250l2 = (C13250l) this.f34662l;
                C17299l c17299l = (C17299l) this.f34661l;
                C15222l c15222l = (C15222l) this.f34665l;
                C2831l c2831l = (C2831l) this.f34664l;
                C14734l c14734l2 = (C14734l) obj;
                float fFloatValue = ((Number) c14734l2.purchase.getValue()).floatValue() - c13250l2.f26029l;
                if (!AbstractC7902l.yandex(fFloatValue)) {
                    if (!AbstractC7902l.yandex(fFloatValue - c17299l.m4302interface(c15222l, fFloatValue))) {
                        c14734l2.yandex();
                        return Unit.INSTANCE;
                    }
                    c13250l2.f26029l += fFloatValue;
                }
                if (((Boolean) c2831l.invoke(Float.valueOf(c13250l2.f26029l))).booleanValue()) {
                    c14734l2.yandex();
                }
                return Unit.INSTANCE;
            case 13:
                C9987l c9987l2 = (C9987l) this.f34662l;
                InterfaceC9473l interfaceC9473l = (InterfaceC9473l) this.f34661l;
                C6472l c6472l = (C6472l) this.f34665l;
                InterfaceC12932l interfaceC12932l = (InterfaceC12932l) this.f34664l;
                try {
                    c9987l2.f20387l = interfaceC9473l.read((ByteBuffer) obj);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    try {
                        c18435l = AbstractC11174l.mopub(interfaceC12932l).mo2153default();
                        break;
                    } catch (Throwable th3) {
                        c18435l = new C18435l(th3);
                    }
                    CancellationException cancellationException = (CancellationException) (c18435l instanceof C18435l ? null : c18435l);
                    if (cancellationException != null) {
                        th2 = cancellationException;
                    }
                    if (th2 instanceof SocketTimeoutException) {
                        throw AbstractC15190l.yandex(c6472l, (IOException) th2);
                    }
                    throw th2;
                }
            case 14:
                C3244l c3244l = (C3244l) this.f34662l;
                InterfaceC12244l interfaceC12244l4 = (InterfaceC12244l) this.f34661l;
                InterfaceC12244l interfaceC12244l5 = (InterfaceC12244l) this.f34665l;
                C9459l c9459l = (C9459l) this.f34664l;
                InterfaceC13349l interfaceC13349l3 = (InterfaceC13349l) obj;
                float fMo868instanceof = interfaceC13349l3.mo868instanceof(20.0f);
                C0404l c0404l = new C0404l(interfaceC13349l3.mo868instanceof(2.5f), 0.0f, 0, 0, new C6853l(new CornerPathEffect(interfaceC13349l3.mo868instanceof(12.0f))), 14);
                C8896l c8896l = c3244l.loadAd;
                C9902l c9902l = c3244l.billing;
                C9902l c9902l2 = c3244l.purchase;
                C9902l c9902l3 = c3244l.amazon;
                C9902l c9902l4 = c3244l.crashlytics;
                if (!c8896l.equals((C8896l) interfaceC12244l4.getValue())) {
                    C8896l c8896l2 = (C8896l) interfaceC12244l4.getValue();
                    c3244l.loadAd = c8896l2;
                    c9902l4.admob();
                    c9902l4.billing(Float.intBitsToFloat((int) (c8896l2.admob() >> 32)) + fMo868instanceof, Float.intBitsToFloat((int) (c8896l2.admob() & 4294967295L)));
                    c9902l4.purchase(Float.intBitsToFloat((int) (c8896l2.admob() >> 32)), Float.intBitsToFloat((int) (c8896l2.admob() & 4294967295L)));
                    c9902l4.purchase(Float.intBitsToFloat((int) (c8896l2.admob() >> 32)), Float.intBitsToFloat((int) (c8896l2.admob() & 4294967295L)) + fMo868instanceof);
                    c9902l3.admob();
                    c9902l3.billing(Float.intBitsToFloat((int) (c8896l2.subs() >> 32)) - fMo868instanceof, Float.intBitsToFloat((int) (c8896l2.admob() & 4294967295L)));
                    c9902l3.purchase(Float.intBitsToFloat((int) (c8896l2.subs() >> 32)), Float.intBitsToFloat((int) (c8896l2.subs() & 4294967295L)));
                    c9902l3.purchase(Float.intBitsToFloat((int) (c8896l2.subs() >> 32)), Float.intBitsToFloat((int) (c8896l2.admob() & 4294967295L)) + fMo868instanceof);
                    c9902l2.admob();
                    c9902l2.billing(Float.intBitsToFloat((int) (c8896l2.amazon() >> 32)) + fMo868instanceof, Float.intBitsToFloat((int) (c8896l2.amazon() & 4294967295L)));
                    c9902l2.purchase(Float.intBitsToFloat((int) (c8896l2.amazon() >> 32)), Float.intBitsToFloat((int) (c8896l2.amazon() & 4294967295L)));
                    c9902l2.purchase(Float.intBitsToFloat((int) (c8896l2.amazon() >> 32)), Float.intBitsToFloat((int) (c8896l2.amazon() & 4294967295L)) - fMo868instanceof);
                    c9902l.admob();
                    c9902l.billing(Float.intBitsToFloat((int) (c8896l2.purchase() >> 32)) - fMo868instanceof, Float.intBitsToFloat((int) (c8896l2.purchase() & 4294967295L)));
                    c9902l.purchase(Float.intBitsToFloat((int) (c8896l2.purchase() >> 32)), Float.intBitsToFloat((int) (c8896l2.purchase() & 4294967295L)));
                    c9902l.purchase(Float.intBitsToFloat((int) (c8896l2.purchase() >> 32)), Float.intBitsToFloat((int) (c8896l2.purchase() & 4294967295L)) - fMo868instanceof);
                }
                C17796l c17796l = new C17796l(interfaceC13349l3, c0404l, interfaceC12244l5, c9459l);
                c17796l.invoke(c9902l4);
                c17796l.invoke(c9902l3);
                c17796l.invoke(c9902l2);
                c17796l.invoke(c9902l);
                return Unit.INSTANCE;
            case 15:
                AbstractC9361l.remoteconfig((InterfaceC13349l) this.f34662l, (C9902l) obj, C9735l.loadAd(1.0f - ((Number) ((C9459l) this.f34664l).f19321l.getValue()).floatValue(), ((C9735l) ((InterfaceC12244l) this.f34661l).getValue()).yandex), 0.0f, (C0404l) this.f34665l, 52);
                return Unit.INSTANCE;
            case 16:
                C6111l c6111l = (C6111l) this.f34662l;
                InterfaceC12244l interfaceC12244l6 = (InterfaceC12244l) this.f34661l;
                InterfaceC12244l interfaceC12244l7 = (InterfaceC12244l) this.f34665l;
                InterfaceC12244l interfaceC12244l8 = (InterfaceC12244l) this.f34664l;
                C1336l c1336l4 = (C1336l) obj;
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-508179868, true, new C12572l(c6111l, r3)), 3);
                if (((Boolean) c6111l.f12902l.getValue()).booleanValue()) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-312060097, true, new C12572l(c6111l, i7)), 3);
                }
                if (!((InterfaceC13238l) interfaceC12244l6.getValue()).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(1946772790, true, new C0692l(c6111l, interfaceC12244l6)), 3);
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-423500947, true, new C0692l(interfaceC12244l6, c6111l)), 3);
                    AbstractC1757l.appmetrica(c1336l4, null, null, AbstractC11852l.yandex, 3);
                }
                AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-1840733413, true, new C12572l(c6111l, i6)), 3);
                if (((EnumC7195l) interfaceC12244l7.getValue()) == EnumC7195l.f15027l) {
                    if (((InterfaceC13238l) interfaceC12244l8.getValue()).isEmpty()) {
                        AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-1938272677, true, new C12572l(c6111l, i4)), 3);
                    } else {
                        AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(126087186, true, new C12572l(c6111l, i5)), 3);
                    }
                } else if (((EnumC7195l) interfaceC12244l7.getValue()) == EnumC7195l.f15026l && ((AbstractC7095l) ((InterfaceC13238l) interfaceC12244l8.getValue())).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(-808401093, true, new C12572l(c6111l, i3)), 3);
                }
                if (!((InterfaceC13238l) interfaceC12244l8.getValue()).isEmpty()) {
                    AbstractC1757l.appmetrica(c1336l4, null, null, new C15578l(810828344, true, new C12572l(c6111l, i2)), 3);
                }
                ?? r0 = (InterfaceC13238l) interfaceC12244l8.getValue();
                c1336l4.firebase(((AbstractC7095l) r0).pro(), new C5640l(r0, 19, r3), new C5640l(r0, 20, r3), new C15578l(802480018, true, new C6090l(r0, c6111l, r3)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC12244l interfaceC12244l9 = (InterfaceC12244l) this.f34661l;
                C5056l c5056l2 = (C5056l) this.f34662l;
                C17003l c17003l = (C17003l) this.f34665l;
                InterfaceC1234l interfaceC1234l2 = (InterfaceC1234l) this.f34664l;
                ?? r6 = (InterfaceC13238l) interfaceC12244l9.getValue();
                C13327l c13327l = C13327l.f26157l;
                ((C1336l) obj).firebase(((AbstractC7095l) r6).pro(), new C5640l(r6, 22), new C5640l(r6, 23, r3), new C15578l(802480018, true, new C2414l(r6, c5056l2, c17003l, interfaceC1234l2, 7)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC2262l interfaceC2262l2 = (InterfaceC2262l) this.f34662l;
                InterfaceC12244l interfaceC12244l10 = (InterfaceC12244l) this.f34661l;
                C2403l c2403l = (C2403l) this.f34665l;
                C12951l c12951l = (C12951l) this.f34664l;
                if (!((EnumC11822l) obj).loadAd() && ((Boolean) interfaceC12244l10.getValue()).booleanValue()) {
                    AbstractC10999l.mopub(interfaceC2262l2, null, 0, new C11290l(c2403l, c12951l, false ? 1 : 0, i5), 3);
                }
                return Unit.INSTANCE;
            default:
                Function0 function5 = (Function0) this.f34662l;
                Function0 function6 = (Function0) this.f34661l;
                C12217l c12217l = (C12217l) this.f34665l;
                EnumC6775l enumC6775l = (EnumC6775l) this.f34664l;
                InterfaceC5912l interfaceC5912l = (InterfaceC5912l) obj;
                function5.invoke();
                if (function6 != null ? ((Boolean) function6.invoke()).booleanValue() : true) {
                    interfaceC5912l.close();
                }
                c12217l.pro(enumC6775l);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C17796l(C9231l c9231l, InterfaceC12244l interfaceC12244l, C0324l c0324l, InterfaceC12244l interfaceC12244l2) {
        this.f34663l = 0;
        this.f34662l = c9231l;
        this.f34661l = interfaceC12244l;
        this.f34664l = c0324l;
        this.f34665l = interfaceC12244l2;
    }

    public /* synthetic */ C17796l(InterfaceC12244l interfaceC12244l, C5056l c5056l, C17003l c17003l, InterfaceC1234l interfaceC1234l) {
        this.f34663l = 17;
        this.f34661l = interfaceC12244l;
        this.f34662l = c5056l;
        this.f34665l = c17003l;
        this.f34664l = interfaceC1234l;
    }

    public /* synthetic */ C17796l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f34663l = i;
        this.f34662l = obj;
        this.f34661l = obj2;
        this.f34665l = obj3;
        this.f34664l = obj4;
    }

    public /* synthetic */ C17796l(ArrayList arrayList, C9987l c9987l, List list, int i, C13217l c13217l) {
        this.f34663l = 8;
        this.f34662l = arrayList;
        this.f34661l = c9987l;
        this.f34665l = list;
        this.f34664l = c13217l;
    }
}
