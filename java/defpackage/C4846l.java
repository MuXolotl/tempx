package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lّؗۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4846l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC8028l f9890l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9891l;

    public /* synthetic */ C4846l(AbstractC8028l abstractC8028l, int i) {
        this.f9891l = i;
        this.f9890l = abstractC8028l;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0170  */
    /* JADX WARN: Code duplicated, block: B:53:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x024f  */
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
    public final Object invoke(Object obj) {
        InterfaceC8371l interfaceC8371l;
        boolean z;
        InterfaceC8657l c12681l;
        InterfaceC8657l c13064l;
        int i = this.f9891l;
        AbstractC8028l abstractC8028l = this.f9890l;
        switch (i) {
            case 0:
                C3498l c3498l = (C3498l) obj;
                AbstractC8028l abstractC8028l2 = abstractC8028l.crashlytics;
                if (abstractC8028l2 != null) {
                    return (Collection) abstractC8028l2.billing.invoke(c3498l);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((InterfaceC6063l) abstractC8028l.purchase.invoke()).crashlytics(c3498l).iterator();
                while (it.hasNext()) {
                    C12113l c12113lTapsense = abstractC8028l.tapsense((C1734l) it.next());
                    if (abstractC8028l.ads(c12113lTapsense)) {
                        ((C7757l) abstractC8028l.loadAd.f20463l).mopub.getClass();
                        arrayList.add(c12113lTapsense);
                    }
                }
                abstractC8028l.isPro(c3498l, arrayList);
                return arrayList;
            case 1:
                C3498l c3498l2 = (C3498l) obj;
                AbstractC8028l abstractC8028l3 = abstractC8028l.crashlytics;
                if (abstractC8028l3 != null) {
                    return (InterfaceC10696l) abstractC8028l3.mopub.invoke(c3498l2);
                }
                C0865l c0865lAmazon = ((InterfaceC6063l) abstractC8028l.purchase.invoke()).amazon(c3498l2);
                if (c0865lAmazon != null) {
                    Field field = c0865lAmazon.yandex;
                    if (!field.isEnumConstant()) {
                        C10700l c10700l = new C10700l();
                        C0865l c0865l = c0865lAmazon;
                        boolean z2 = !Modifier.isFinal(c0865l.yandex().getModifiers());
                        C10038l c10038l = abstractC8028l.loadAd;
                        C12544l c12544lBilling = AbstractC12081l.billing(c10038l, c0865lAmazon);
                        C7757l c7757l = (C7757l) c10038l.f20463l;
                        InterfaceC8371l interfaceC8371lAdcel = abstractC8028l.adcel();
                        C6561l c6561lSubs = AbstractC15901l.subs(c0865l.purchase());
                        C3498l c3498lCrashlytics = c0865l.crashlytics();
                        C11197l c11197lStartapp = c7757l.isPro.startapp(c0865lAmazon);
                        if (Modifier.isFinal(c0865l.yandex().getModifiers()) && Modifier.isStatic(c0865l.yandex().getModifiers())) {
                            interfaceC8371l = interfaceC8371lAdcel;
                            z = true;
                        } else {
                            interfaceC8371l = interfaceC8371lAdcel;
                            z = false;
                        }
                        C4099l c4099lM1488l = C4099l.m1488l(interfaceC8371l, c12544lBilling, c6561lSubs, z2, c3498lCrashlytics, c11197lStartapp, z);
                        c10700l.f21708l = c4099lM1488l;
                        c4099lM1488l.m3647l(null, null, null, null);
                        C18449l c18449l = (C18449l) c10038l.f20465l;
                        Type genericType = field.getGenericType();
                        boolean z3 = genericType instanceof Class;
                        if (z3) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                c13064l = new C13064l(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z3 && ((Class) genericType).isArray())) {
                                    c12681l = new C12681l(genericType);
                                } else {
                                    c12681l = genericType instanceof WildcardType ? new C6962l((WildcardType) genericType) : new C5637l(genericType);
                                }
                                c13064l = c12681l;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                c12681l = new C12681l(genericType);
                            } else {
                                c12681l = new C12681l(genericType);
                            }
                            c13064l = c12681l;
                        }
                        AbstractC18041l abstractC18041lM4556this = c18449l.m4556this(c13064l, AbstractC1135l.purchase(2, false, null, 7));
                        if ((AbstractC16860l.m4207throws(abstractC18041lM4556this) || AbstractC16860l.m4204package(abstractC18041lM4556this)) && Modifier.isFinal(c0865l.yandex().getModifiers())) {
                            Modifier.isStatic(c0865l.yandex().getModifiers());
                        }
                        C13437l c13437l = (C13437l) c10700l.f21708l;
                        C7073l c7073lStartapp = abstractC8028l.startapp();
                        C2580l c2580l = C2580l.f5619l;
                        c13437l.m3646l(abstractC18041lM4556this, c2580l, c7073lStartapp, null, c2580l);
                        InterfaceC8371l interfaceC8371lAdcel2 = abstractC8028l.adcel();
                        if ((interfaceC8371lAdcel2 instanceof InterfaceC17477l ? (InterfaceC17477l) interfaceC8371lAdcel2 : null) != null) {
                            InterfaceC13037l interfaceC13037l = c7757l.ad;
                            C13437l c13437l2 = (C13437l) c10700l.f21708l;
                            ((C13772l) interfaceC13037l).getClass();
                            c10700l.f21708l = c13437l2;
                        }
                        Object obj2 = c10700l.f21708l;
                        InterfaceC11764l interfaceC11764l = (InterfaceC11764l) obj2;
                        AbstractC18041l abstractC18041lYandex = ((C13437l) obj2).yandex();
                        if (interfaceC11764l == null) {
                            AbstractC11125l.yandex(65);
                            throw null;
                        }
                        if (abstractC18041lYandex == null) {
                            AbstractC11125l.yandex(66);
                            throw null;
                        }
                        int i2 = AbstractC11125l.yandex;
                        if (!interfaceC11764l.mo3250const() && !AbstractC11748l.subs(abstractC18041lYandex)) {
                            if (AbstractC12008l.loadAd(abstractC18041lYandex)) {
                                ((C13437l) c10700l.f21708l).m3645l(null, new C17749l(abstractC8028l, c0865lAmazon, c10700l, 5));
                            } else {
                                AbstractC16860l abstractC16860lPurchase = AbstractC3759l.purchase(interfaceC11764l);
                                if (AbstractC16860l.m4207throws(abstractC18041lYandex)) {
                                    ((C13437l) c10700l.f21708l).m3645l(null, new C17749l(abstractC8028l, c0865lAmazon, c10700l, 5));
                                } else {
                                    C5215l c5215l = InterfaceC17975l.yandex;
                                    if (c5215l.yandex(abstractC16860lPurchase.Signature(), abstractC18041lYandex) || c5215l.yandex(abstractC16860lPurchase.firebase(DataTypes.OBJ_NUMBER).ad(), abstractC18041lYandex) || c5215l.yandex(abstractC16860lPurchase.purchase(), abstractC18041lYandex) || AbstractC4056l.yandex(abstractC18041lYandex)) {
                                        ((C13437l) c10700l.f21708l).m3645l(null, new C17749l(abstractC8028l, c0865lAmazon, c10700l, 5));
                                    }
                                }
                            }
                        }
                        C17334l c17334l = c7757l.mopub;
                        InterfaceC10696l interfaceC10696l = (InterfaceC10696l) c10700l.f21708l;
                        c17334l.getClass();
                        if (interfaceC10696l != null) {
                            return (InterfaceC10696l) c10700l.f21708l;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                C3498l c3498l3 = (C3498l) obj;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) abstractC8028l.billing.invoke(c3498l3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : linkedHashSet) {
                    String strLoadAd = AbstractC17860l.loadAd((C17134l) obj3, 2);
                    Object arrayList2 = linkedHashMap.get(strLoadAd);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strLoadAd, arrayList2);
                    }
                    ((List) arrayList2).add(obj3);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionCrashlytics = AbstractC14905l.crashlytics(list, C1490l.f3712l);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionCrashlytics);
                    }
                }
                abstractC8028l.remoteconfig(linkedHashSet, c3498l3);
                C10038l c10038l2 = abstractC8028l.loadAd;
                return AbstractC16901l.m4213const(((C7757l) c10038l2.f20463l).ads.metrica(c10038l2, linkedHashSet));
            default:
                C3498l c3498l4 = (C3498l) obj;
                ArrayList arrayList3 = new ArrayList();
                AbstractC3324l.crashlytics(arrayList3, abstractC8028l.mopub.invoke(c3498l4));
                abstractC8028l.vip(c3498l4, arrayList3);
                if (AbstractC11125l.smaato(abstractC8028l.adcel(), 5)) {
                    return AbstractC16901l.m4213const(arrayList3);
                }
                C10038l c10038l3 = abstractC8028l.loadAd;
                return AbstractC16901l.m4213const(((C7757l) c10038l3.f20463l).ads.metrica(c10038l3, arrayList3));
        }
    }
}
