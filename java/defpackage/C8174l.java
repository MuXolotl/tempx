package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* JADX INFO: renamed from: lًٞۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8174l implements Function4 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ C5636l f17060l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ View f17061l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12244l f17062l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7091l f17063l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ C18233l f17064l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2262l f17065l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ int f17066l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ int f17067l;

    public C8174l(C18233l c18233l, C7091l c7091l, C5636l c5636l, int i, InterfaceC2262l interfaceC2262l, int i2, View view, InterfaceC12244l interfaceC12244l) {
        this.f17064l = c18233l;
        this.f17063l = c7091l;
        this.f17060l = c5636l;
        this.f17066l = i;
        this.f17065l = interfaceC2262l;
        this.f17067l = i2;
        this.f17061l = view;
        this.f17062l = interfaceC12244l;
    }

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
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C18297l c18297l = (C18297l) obj;
        ((Boolean) obj2).getClass();
        C6956l c6956l = (C6956l) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c6956l.billing(c18297l) ? 4 : 2;
        }
        if (c6956l.m2127for(iIntValue & 1, (iIntValue & 131) != 130)) {
            C15578l c15578lAmazon = AbstractC14566l.amazon(-753519798, new C6640l(c18297l, this.f17061l, 11), c6956l);
            C18233l c18233l = this.f17064l;
            EnumC14435l enumC14435l = c18233l.f35744l;
            EnumC14435l enumC14435l2 = EnumC14435l.GENIUS;
            C5636l c5636l = this.f17060l;
            int i = this.f17067l;
            C13863l c13863l = C1867l.yandex;
            C4346l c4346l = C4346l.f8873l;
            C7091l c7091l = this.f17063l;
            InterfaceC2262l interfaceC2262l = this.f17065l;
            if (enumC14435l == enumC14435l2 || enumC14435l == EnumC14435l.VK) {
                c6956l.m2123default(-1111829213);
                boolean z = c18233l.f35743l;
                InterfaceC17242l interfaceC17242lSmaato = AbstractC5020l.smaato(c7091l, c4346l);
                boolean zAdmob = c6956l.admob(interfaceC2262l) | c6956l.admob(c18233l);
                Object objM2132native = c6956l.m2132native();
                if (zAdmob || objM2132native == c13863l) {
                    objM2132native = new C7253l(interfaceC2262l, c18233l, 0);
                    c6956l.m2147try(objM2132native);
                }
                c5636l.m1838import(this.f17066l, z, (Function1) objM2132native, c15578lAmazon, interfaceC17242lSmaato, Integer.valueOf(i), false, c6956l, 3072);
                c6956l.startapp(false);
            } else {
                c6956l.m2123default(-1111176508);
                boolean z2 = c18233l.f35743l;
                InterfaceC17242l interfaceC17242lSmaato2 = AbstractC5020l.smaato(c7091l, c4346l);
                boolean zBooleanValue = ((Boolean) this.f17062l.getValue()).booleanValue();
                boolean zAdmob2 = c6956l.admob(interfaceC2262l) | c6956l.admob(c18233l);
                Object objM2132native2 = c6956l.m2132native();
                if (zAdmob2 || objM2132native2 == c13863l) {
                    objM2132native2 = new C7253l(interfaceC2262l, c18233l, 1);
                    c6956l.m2147try(objM2132native2);
                }
                c5636l.m1837abstract(this.f17066l, c15578lAmazon, z2, (Function1) objM2132native2, interfaceC17242lSmaato2, Integer.valueOf(i), false, zBooleanValue, c6956l, 48);
                c6956l.startapp(false);
            }
        } else {
            c6956l.m2124else();
        }
        return Unit.INSTANCE;
    }
}
