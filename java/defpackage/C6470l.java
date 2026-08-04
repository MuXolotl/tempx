package defpackage;

import android.util.Size;

/* JADX INFO: renamed from: lؙٔۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6470l {
    public static final C16506l yandex;

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
    static {
        Object size = new Size(640, 480);
        Object c18085l = new C18085l(C14513l.f28387l, new C10077l(AbstractC5513l.crashlytics), null);
        C14929l c14929l = new C14929l(0);
        C6916l c6916l = InterfaceC4089l.f8423package;
        C5104l c5104l = c14929l.f29382l;
        c5104l.mopub(c6916l, size);
        c5104l.mopub(InterfaceC0048l.f920l, 1);
        c5104l.mopub(InterfaceC4089l.premium, 0);
        c5104l.mopub(InterfaceC4089l.f8427volatile, c18085l);
        C15421l c15421l = C15421l.amazon;
        if (!c15421l.equals(c15421l)) {
            C10754l.ads("ImageAnalysis currently only supports SDR");
        } else {
            c5104l.mopub(InterfaceC16352l.signatures, c15421l);
            yandex = new C16506l(C7420l.yandex(c5104l));
        }
    }
}
