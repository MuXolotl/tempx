package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘْٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13164l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final AbstractC15940l f25778l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25779l;

    public /* synthetic */ C13164l(AbstractC15940l abstractC15940l, int i) {
        this.f25779l = i;
        this.f25778l = abstractC15940l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GenericDeclaration genericDeclarationM655catch;
        AbstractC9640l abstractC9640lM4123extends;
        GenericDeclaration genericDeclarationM663throw;
        int i = this.f25779l;
        boolean z = false;
        AbstractC15940l abstractC15940l = this.f25778l;
        switch (i) {
            case 0:
                AbstractC15940l abstractC15940l2 = this.f25778l;
                return AbstractC4107l.loadAd(abstractC15940l2, abstractC15940l2.mo2442for(), abstractC15940l2.mo2443throw(), abstractC15940l2.mo2439case(), abstractC15940l2.mo2441else(), true);
            case 1:
                AbstractC15940l abstractC15940l3 = this.f25778l;
                return AbstractC7572l.admob(abstractC15940l3) ? AbstractC4107l.loadAd(abstractC15940l3, abstractC15940l3.mo2442for(), abstractC15940l3.mo2443throw(), abstractC15940l3.mo2439case(), abstractC15940l3.mo2441else(), false) : abstractC15940l3.admob();
            case 2:
                boolean zSubs = AbstractC7572l.subs(abstractC15940l);
                AbstractC0601l abstractC0601l = abstractC15940l.f31302l;
                if (!zSubs && !(abstractC0601l instanceof C9539l)) {
                    C8936l.smaato(abstractC15940l, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C1559l c1559lMo2440catch = abstractC15940l.mo2440catch();
                String str = c1559lMo2440catch.crashlytics;
                if (AbstractC7572l.subs(abstractC15940l) && (!(abstractC0601l instanceof C5160l) || !((C5160l) abstractC0601l).ads())) {
                    if (AbstractC7572l.mopub(abstractC15940l)) {
                        Class clsMo1730private = abstractC0601l.mo1730private();
                        List parameters = abstractC15940l.getParameters();
                        ArrayList arrayList = new ArrayList(AbstractC14055l.billing(parameters, 10));
                        Iterator it = parameters.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((AbstractC9707l) it.next()).getName());
                        }
                        return new C5913l(clsMo1730private, arrayList, 2);
                    }
                    Class clsMo1730private2 = abstractC0601l.mo1730private();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) AbstractC5592l.firebase(AbstractC1845l.amazon(abstractC0601l.mo1730private()), str, false).f20419l).toArray(new Class[0]);
                        genericDeclarationM655catch = clsMo1730private2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                    } catch (NoSuchMethodException unused) {
                        genericDeclarationM655catch = null;
                    }
                    break;
                } else {
                    genericDeclarationM655catch = abstractC0601l.m655catch(c1559lMo2440catch.loadAd, str);
                }
                if (genericDeclarationM655catch instanceof Constructor) {
                    abstractC9640lM4123extends = abstractC15940l.m4124private((Constructor) genericDeclarationM655catch, false);
                } else {
                    if (!(genericDeclarationM655catch instanceof Method)) {
                        C11467l.Signature(abstractC15940l, "Could not compute caller for function: ");
                        return null;
                    }
                    abstractC9640lM4123extends = abstractC15940l.m4123extends((Method) genericDeclarationM655catch, false);
                }
                return AbstractC13457l.loadAd(abstractC9640lM4123extends, abstractC15940l, C2580l.f5619l, false);
            default:
                boolean zSubs2 = AbstractC7572l.subs(abstractC15940l);
                AbstractC0601l abstractC0601l2 = abstractC15940l.f31302l;
                if (!zSubs2 && !(abstractC0601l2 instanceof C9539l)) {
                    C8936l.smaato(abstractC15940l, "Only constructors and top-level functions are supported for now: ");
                    return null;
                }
                C1559l c1559lMo2440catch2 = abstractC15940l.mo2440catch();
                ArrayList arrayList2 = new ArrayList();
                int i2 = 1;
                if (AbstractC7572l.subs(abstractC15940l) && (!(abstractC0601l2 instanceof C5160l) || !((C5160l) abstractC0601l2).ads())) {
                    if (AbstractC7572l.mopub(abstractC15940l)) {
                        Class clsMo1730private3 = abstractC0601l2.mo1730private();
                        List parameters2 = abstractC15940l.getParameters();
                        ArrayList arrayList3 = new ArrayList(AbstractC14055l.billing(parameters2, 10));
                        Iterator it2 = parameters2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((AbstractC9707l) it2.next()).getName());
                        }
                        return new C5913l(clsMo1730private3, arrayList3, i2);
                    }
                    C3797l c3797lIsPro = AbstractC10565l.isPro(abstractC15940l, abstractC15940l.mo2440catch().crashlytics);
                    arrayList2.addAll((Set) c3797lIsPro.f7902l);
                    String str2 = (String) c3797lIsPro.f7903l;
                    Class clsMo1730private4 = abstractC0601l2.mo1730private();
                    ArrayList arrayList4 = new ArrayList();
                    AbstractC0601l.m652extends(arrayList4, (ArrayList) AbstractC5592l.firebase(AbstractC1845l.amazon(abstractC0601l2.mo1730private()), str2, false).f20419l, true, false);
                    Unit unit = Unit.INSTANCE;
                    try {
                        Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                        genericDeclarationM663throw = clsMo1730private4.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                    } catch (NoSuchMethodException unused2) {
                        genericDeclarationM663throw = null;
                    }
                    break;
                } else {
                    C3797l c3797lIsPro2 = AbstractC10565l.isPro(abstractC15940l, c1559lMo2440catch2.crashlytics);
                    arrayList2.addAll((Set) c3797lIsPro2.f7902l);
                    String str3 = c1559lMo2440catch2.loadAd;
                    String str4 = (String) c3797lIsPro2.f7903l;
                    boolean z2 = !Modifier.isStatic(abstractC15940l.isPro().loadAd().getModifiers());
                    List listAdmob = abstractC15940l.admob();
                    if (listAdmob == null || !listAdmob.isEmpty()) {
                        Iterator it3 = listAdmob.iterator();
                        while (it3.hasNext()) {
                            if (((AbstractC9707l) it3.next()).premium() == 3) {
                                z = true;
                            }
                        }
                    }
                    genericDeclarationM663throw = abstractC0601l2.m663throw(str3, str4, z2, z);
                }
                AbstractC9640l abstractC9640lM4124private = genericDeclarationM663throw instanceof Constructor ? abstractC15940l.m4124private((Constructor) genericDeclarationM663throw, true) : genericDeclarationM663throw instanceof Method ? abstractC15940l.m4123extends((Method) genericDeclarationM663throw, abstractC15940l.isPro().crashlytics()) : null;
                if (abstractC9640lM4124private != null) {
                    return AbstractC13457l.loadAd(abstractC9640lM4124private, abstractC15940l, arrayList2, true);
                }
                return null;
        }
    }
}
