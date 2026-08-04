package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: lُؓٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10804l extends AbstractC15029l implements Runnable, InterfaceC12833l, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final Integer[] f21843l = {8, 64, 4, 1, 128, 16, 2, 32};

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f21844l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C16977l f21845l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C16977l f21846l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C1473l f21847l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f21848l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C10086l f21849l;

    public RunnableC10804l() {
        super(1);
        this.f21849l = AbstractC8020l.smaato(null);
        this.f21845l = new C16977l(8);
        this.f21846l = new C16977l(8);
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final void m2978catch(C1473l c1473l) {
        boolean z = false;
        if (m2979extends() == null) {
            C15496l c15496l = C15496l.purchase;
            Integer[] numArr = f21843l;
            for (int i = 0; i < 8; i++) {
                int iIntValue = numArr[i].intValue();
                if (AbstractC8576l.yandex(iIntValue == 8 ? c1473l.yandex.subs(iIntValue) : c1473l.yandex.isPro(iIntValue), c15496l)) {
                }
            }
            return;
        }
        this.f21849l.setValue(c1473l);
        synchronized (AbstractC9620l.crashlytics) {
            C6295l c6295l = AbstractC9620l.isPro.admob;
            if (c6295l != null && c6295l.subs()) {
                z = true;
            }
        }
        if (z) {
            AbstractC9620l.yandex();
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public final C1473l m2979extends() {
        return (C1473l) this.f21849l.getValue();
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
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final InterfaceC8714l m2980for(int i) {
        C16977l c16977l = this.f21845l;
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) c16977l.loadAd(i);
        if (interfaceC8714l != null) {
            return interfaceC8714l;
        }
        C10086l c10086lSmaato = AbstractC8020l.smaato(null);
        c16977l.subs(i, c10086lSmaato);
        return c10086lSmaato;
    }

    @Override // defpackage.InterfaceC12833l
    /* JADX INFO: renamed from: implements */
    public final C1473l mo404implements(View view, C1473l c1473l) {
        if (this.f21844l) {
            this.f21847l = c1473l;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c1473l;
            }
        } else if (this.f21848l == 0) {
            m2978catch(c1473l);
        }
        return c1473l;
    }

    @Override // defpackage.AbstractC15029l
    public final C13645l metrica(C12902l c12902l, C13645l c13645l) {
        C1473l c1473l = this.f21847l;
        boolean z = false;
        this.f21844l = false;
        this.f21847l = null;
        if (c12902l.yandex.yandex() > 0 && c1473l != null) {
            int iCrashlytics = c12902l.yandex.crashlytics();
            C1473l c1473lM2979extends = m2979extends();
            C15496l c15496lSubs = c1473lM2979extends != null ? c1473lM2979extends.yandex.subs(iCrashlytics) : null;
            C15496l c15496lSubs2 = c1473l.yandex.subs(iCrashlytics);
            if (!AbstractC8576l.yandex(c15496lSubs2, c15496lSubs) && c15496lSubs != null) {
                this.f21848l |= iCrashlytics;
                m2980for(iCrashlytics).setValue(c12902l);
                m2981throw(iCrashlytics).setValue(new C7193l(c15496lSubs, c15496lSubs2));
                synchronized (AbstractC9620l.crashlytics) {
                    C6295l c6295l = AbstractC9620l.isPro.admob;
                    if (c6295l != null && c6295l.subs()) {
                        z = true;
                    }
                }
                if (z) {
                    AbstractC9620l.yandex();
                    return c13645l;
                }
            }
        }
        return c13645l;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        AbstractC8558l.crashlytics(view, this);
        AbstractC15872l.startapp(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC15872l.yandex;
        AbstractC8558l.crashlytics(view, null);
        AbstractC15872l.startapp(view, null);
    }

    @Override // defpackage.AbstractC15029l
    public final void remoteconfig(C12902l c12902l) {
        this.f21844l = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21844l) {
            this.f21848l = 0;
            this.f21844l = false;
            C1473l c1473l = this.f21847l;
            if (c1473l != null) {
                m2978catch(c1473l);
                this.f21847l = null;
            }
        }
    }

    @Override // defpackage.AbstractC15029l
    public final void smaato(C12902l c12902l) {
        boolean z = false;
        this.f21844l = false;
        int iCrashlytics = c12902l.yandex.crashlytics();
        m2980for(iCrashlytics).setValue(null);
        m2981throw(iCrashlytics).setValue(null);
        this.f21848l = (~iCrashlytics) & this.f21848l;
        this.f21847l = null;
        synchronized (AbstractC9620l.crashlytics) {
            C6295l c6295l = AbstractC9620l.isPro.admob;
            if (c6295l != null && c6295l.subs()) {
                z = true;
            }
        }
        if (z) {
            AbstractC9620l.yandex();
        }
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
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final InterfaceC8714l m2981throw(int i) {
        C16977l c16977l = this.f21846l;
        InterfaceC8714l interfaceC8714l = (InterfaceC8714l) c16977l.loadAd(i);
        if (interfaceC8714l != null) {
            return interfaceC8714l;
        }
        C10086l c10086lSmaato = AbstractC8020l.smaato(null);
        c16977l.subs(i, c10086lSmaato);
        return c10086lSmaato;
    }

    @Override // defpackage.AbstractC15029l
    public final C1473l vip(C1473l c1473l, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C12902l c12902l = (C12902l) list.get(i);
            int iCrashlytics = c12902l.yandex.crashlytics();
            if ((this.f21848l & iCrashlytics) != 0) {
                m2980for(iCrashlytics).setValue(c12902l);
            }
        }
        m2978catch(c1473l);
        return c1473l;
    }
}
