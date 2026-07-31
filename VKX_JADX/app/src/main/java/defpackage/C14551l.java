package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٓۦً, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14551l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C15015l f28493l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28494l;

    public /* synthetic */ C14551l(C15015l c15015l, int i) {
        this.f28494l = i;
        this.f28493l = c15015l;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC9640l abstractC9640lM3918else;
        GenericDeclaration declaredConstructor;
        AbstractC9640l abstractC9640lM3918else2;
        InterfaceC1388l interfaceC1388l;
        Object next;
        InterfaceC7763l interfaceC7763l;
        int i = this.f28494l;
        C15015l c15015l = this.f28493l;
        Object objM655catch = null;
        switch (i) {
            case 0:
                C3624l c3624l = AbstractC1653l.yandex;
                InterfaceC4884l interfaceC4884lMo818extends = c15015l.mo818extends();
                AbstractC0601l abstractC0601l = c15015l.f29532l;
                AbstractC7439l abstractC7439lCrashlytics = AbstractC1653l.crashlytics(interfaceC4884lMo818extends);
                if (abstractC7439lCrashlytics instanceof C18336l) {
                    if (AbstractC7572l.mopub(c15015l)) {
                        Class clsMo1730private = abstractC0601l.mo1730private();
                        List parameters = c15015l.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AbstractC9707l) it.next()).getName());
                        }
                        return new C5913l(clsMo1730private, arrayList, 2);
                    }
                    String str = ((C18336l) abstractC7439lCrashlytics).loadAd.crashlytics;
                    Class clsMo1730private2 = abstractC0601l.mo1730private();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) AbstractC5592l.firebase(AbstractC1845l.amazon(abstractC0601l.mo1730private()), str, false).f20419l).toArray(new Class[0]);
                        objM655catch = clsMo1730private2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (abstractC7439lCrashlytics instanceof C5061l) {
                    C0166l c0166l = ((C5061l) abstractC7439lCrashlytics).loadAd;
                    objM655catch = abstractC0601l.m655catch(c0166l.loadAd, c0166l.crashlytics);
                } else if (abstractC7439lCrashlytics instanceof C4890l) {
                    objM655catch = ((C4890l) abstractC7439lCrashlytics).loadAd;
                } else {
                    if (!(abstractC7439lCrashlytics instanceof C13796l)) {
                        if (!(abstractC7439lCrashlytics instanceof C10922l)) {
                            C18725l.billing();
                            return null;
                        }
                        List list = ((C10922l) abstractC7439lCrashlytics).loadAd;
                        Class clsMo1730private3 = abstractC0601l.mo1730private();
                        ArrayList arrayList2 = new ArrayList(AbstractC14055l.billing(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Method) it2.next()).getName());
                        }
                        return new C5913l(clsMo1730private3, arrayList2, 2, 1, list);
                    }
                    objM655catch = ((C13796l) abstractC7439lCrashlytics).loadAd;
                }
                if (objM655catch instanceof Constructor) {
                    abstractC9640lM3918else = c15015l.m3917catch((Constructor) objM655catch, c15015l.mo818extends(), false);
                } else {
                    if (!(objM655catch instanceof Method)) {
                        throw new C3150l("Could not compute caller for function: " + c15015l.mo818extends() + " (member = " + objM655catch + ')');
                    }
                    Method method = (Method) objM655catch;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        abstractC9640lM3918else = AbstractC7572l.admob(c15015l) ? new C12056l(method, AbstractC7572l.purchase(c15015l)) : new C14041l(0, method);
                    } else if (((Cgoto) c15015l.mo818extends()).getAnnotations().loadAd(AbstractC5592l.yandex) != null) {
                        abstractC9640lM3918else = AbstractC7572l.admob(c15015l) ? new C12503l(method) : new C14041l(method);
                    } else {
                        abstractC9640lM3918else = c15015l.m3918else(method, false);
                    }
                }
                return AbstractC13457l.loadAd(abstractC9640lM3918else, c15015l, C2580l.f5619l, false);
            case 1:
                ArrayList arrayList3 = new ArrayList();
                C3624l c3624l2 = AbstractC1653l.yandex;
                InterfaceC4884l interfaceC4884lMo818extends2 = c15015l.mo818extends();
                AbstractC0601l abstractC0601l2 = c15015l.f29532l;
                AbstractC7439l abstractC7439lCrashlytics2 = AbstractC1653l.crashlytics(interfaceC4884lMo818extends2);
                if (!(abstractC7439lCrashlytics2 instanceof C5061l)) {
                    if (abstractC7439lCrashlytics2 instanceof C18336l) {
                        if (AbstractC7572l.mopub(c15015l)) {
                            Class clsMo1730private4 = abstractC0601l2.mo1730private();
                            List parameters2 = c15015l.getParameters();
                            ArrayList arrayList4 = new ArrayList(AbstractC14055l.billing(parameters2, 10));
                            Iterator it3 = parameters2.iterator();
                            while (it3.hasNext()) {
                                arrayList4.add(((AbstractC9707l) it3.next()).getName());
                            }
                            return new C5913l(clsMo1730private4, arrayList4, 1);
                        }
                        C3797l c3797lIsPro = AbstractC10565l.isPro(c15015l, ((C18336l) abstractC7439lCrashlytics2).loadAd.crashlytics);
                        arrayList3.addAll((Set) c3797lIsPro.f7902l);
                        String str2 = (String) c3797lIsPro.f7903l;
                        Class clsMo1730private5 = abstractC0601l2.mo1730private();
                        ArrayList arrayList5 = new ArrayList();
                        AbstractC0601l.m652extends(arrayList5, (ArrayList) AbstractC5592l.firebase(AbstractC1845l.amazon(abstractC0601l2.mo1730private()), str2, false).f20419l, true, false);
                        Unit unit = Unit.INSTANCE;
                        try {
                            Class[] clsArr2 = (Class[]) arrayList5.toArray(new Class[0]);
                            declaredConstructor = clsMo1730private5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (abstractC7439lCrashlytics2 instanceof C10922l) {
                        List list2 = ((C10922l) abstractC7439lCrashlytics2).loadAd;
                        Class clsMo1730private6 = abstractC0601l2.mo1730private();
                        ArrayList arrayList6 = new ArrayList(AbstractC14055l.billing(list2, 10));
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Method) it4.next()).getName());
                        }
                        return new C5913l(clsMo1730private6, arrayList6, 1, 1, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    ArrayList arrayListMopub = AbstractC0825l.mopub(c15015l);
                    if (arrayListMopub.isEmpty()) {
                        if (abstractC0601l2 instanceof InterfaceC1388l) {
                            interfaceC1388l = (InterfaceC1388l) abstractC0601l2;
                        } else {
                            interfaceC1388l = null;
                        }
                        if (interfaceC1388l == null && interfaceC1388l.ads() && Modifier.isStatic(c15015l.isPro().loadAd().getModifiers())) {
                            Collection<InterfaceC4884l> collectionLicense = c15015l.mo818extends().license();
                            ArrayList arrayList7 = new ArrayList(AbstractC14055l.billing(collectionLicense, 10));
                            for (InterfaceC4884l interfaceC4884l : collectionLicense) {
                                Class clsMetrica = AbstractC5592l.metrica((InterfaceC17477l) interfaceC4884l.Signature());
                                if (clsMetrica == null) {
                                    C11467l.Signature(c15015l, "Unknown container class for overridden function: ");
                                    return null;
                                }
                                arrayList7.add(new C15015l((C5160l) AbstractC18202l.yandex.loadAd(clsMetrica), interfaceC4884l));
                            }
                            Iterator it5 = arrayList7.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    next = it5.next();
                                    ArrayList arrayListMopub2 = AbstractC0825l.mopub((InterfaceC7763l) next);
                                    if (!arrayListMopub2.isEmpty()) {
                                        Iterator it6 = arrayListMopub2.iterator();
                                        while (true) {
                                            if (it6.hasNext()) {
                                                AbstractC9707l abstractC9707l = (AbstractC9707l) it6.next();
                                                if (!(abstractC9707l instanceof AbstractC9707l)) {
                                                    abstractC9707l = null;
                                                }
                                                if (abstractC9707l == null || !abstractC9707l.remoteconfig()) {
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            interfaceC7763l = (InterfaceC7763l) next;
                        } else {
                            interfaceC7763l = null;
                        }
                    } else {
                        Iterator it7 = arrayListMopub.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                AbstractC9707l abstractC9707l2 = (AbstractC9707l) it7.next();
                                if (!(abstractC9707l2 instanceof AbstractC9707l)) {
                                    abstractC9707l2 = null;
                                }
                                if (abstractC9707l2 == null || !abstractC9707l2.remoteconfig()) {
                                }
                            } else {
                                if (abstractC0601l2 instanceof InterfaceC1388l) {
                                    interfaceC1388l = (InterfaceC1388l) abstractC0601l2;
                                } else {
                                    interfaceC1388l = null;
                                }
                                if (interfaceC1388l == null) {
                                }
                            }
                            interfaceC7763l = null;
                        }
                    }
                    if (interfaceC7763l != null) {
                        String strM3351while = AbstractC12024l.m3351while(interfaceC7763l.loadAd(), '(');
                        C3797l c3797lIsPro2 = AbstractC10565l.isPro(interfaceC7763l, interfaceC7763l.loadAd().substring(strM3351while.length()));
                        arrayList3.addAll((Set) c3797lIsPro2.f7902l);
                        declaredConstructor = abstractC0601l2.m663throw(strM3351while, (String) c3797lIsPro2.f7903l, true, c15015l.mo818extends().mo1479return() != null);
                    } else {
                        C0166l c0166l2 = ((C5061l) abstractC7439lCrashlytics2).loadAd;
                        C3797l c3797lIsPro3 = AbstractC10565l.isPro(c15015l, c0166l2.crashlytics);
                        arrayList3.addAll((Set) c3797lIsPro3.f7902l);
                        declaredConstructor = abstractC0601l2.m663throw(c0166l2.loadAd, (String) c3797lIsPro3.f7903l, !Modifier.isStatic(c15015l.isPro().loadAd().getModifiers()), c15015l.mo818extends().mo1479return() != null);
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    abstractC9640lM3918else2 = c15015l.m3917catch((Constructor) declaredConstructor, c15015l.mo818extends(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    abstractC9640lM3918else2 = null;
                } else if (((Cgoto) c15015l.mo818extends()).getAnnotations().loadAd(AbstractC5592l.yandex) == null || ((InterfaceC17477l) c15015l.mo818extends().Signature()).mo757throws()) {
                    abstractC9640lM3918else2 = c15015l.m3918else((Method) declaredConstructor, c15015l.isPro().crashlytics());
                } else {
                    Method method2 = (Method) declaredConstructor;
                    abstractC9640lM3918else2 = AbstractC7572l.admob(c15015l) ? new C12503l(method2) : new C14041l(method2);
                }
                if (abstractC9640lM3918else2 != null) {
                    return AbstractC13457l.loadAd(abstractC9640lM3918else2, c15015l, arrayList3, true);
                }
                return null;
            default:
                Type typeAmazon = AbstractC10565l.amazon(c15015l);
                return typeAmazon == null ? c15015l.isPro().smaato() : typeAmazon;
        }
    }
}
