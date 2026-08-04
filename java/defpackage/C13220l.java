package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;
import ua.itaysonlab.catalogkit.objects.Catalog2Root;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lًُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13220l extends AbstractC15680l implements InterfaceC0605l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public View f25996l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C11390l f25997l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public List f25998l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public List f26000l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public C11560l f26003l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final C1008l f25999l = AbstractC11190l.yandex("");

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final C1008l f26001l = AbstractC11190l.yandex("");

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C15288l f26002l = new C15288l(this);

    public C13220l() {
        C2580l c2580l = C2580l.f5619l;
        this.f26000l = c2580l;
        this.f25998l = c2580l;
        this.f25997l = new C11390l(c2580l, true, new C12433l(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public static final Object m3620abstract(C13220l c13220l, String str, AbstractC0283l abstractC0283l) {
        C7068l c7068l;
        Object c18435l;
        C2975l c2975l;
        C14047l c14047l;
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        C13220l c13220l2;
        List<Catalog2Section> list;
        if (abstractC0283l instanceof C7068l) {
            c7068l = (C7068l) abstractC0283l;
            int i = c7068l.f14811l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7068l.f14811l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7068l = new C7068l(c13220l, abstractC0283l);
            }
        } else {
            c7068l = new C7068l(c13220l, abstractC0283l);
        }
        Object objAdmob = c7068l.f14810l;
        int i2 = c7068l.f14811l;
        C2580l c2580l = C2580l.f5619l;
        InterfaceC14029l interfaceC14029l = null;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    i2 = c7068l.f14809l;
                    c13220l2 = c7068l.f14815l;
                    arrayList2 = c7068l.f14812l;
                    arrayList = c7068l.f14813l;
                    AbstractC2829l.crashlytics(objAdmob);
                } else {
                    if (i2 != 2) {
                        C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC2829l.crashlytics(objAdmob);
                }
                return Unit.INSTANCE;
            }
            AbstractC2829l.crashlytics(objAdmob);
            boolean zM3315catch = AbstractC12024l.m3315catch(str);
            i2 = !zM3315catch ? 1 : 0;
            if (zM3315catch) {
                c13220l.f26000l = c2580l;
                c13220l.f25998l = c2580l;
            } else {
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                C12772l c12772l = new C12772l(22, str, null, false);
                c7068l.f14813l = arrayList;
                c7068l.f14812l = arrayList2;
                c7068l.f14815l = c13220l;
                c7068l.f14809l = i2;
                c7068l.f14811l = 1;
                objAdmob = AbstractC8189l.admob(c12772l, c7068l);
                if (objAdmob == enumC9342l) {
                    return enumC9342l;
                }
                c13220l2 = c13220l;
            }
            C16552l c16552l = AbstractC11463l.yandex;
            c2975l = AbstractC17278l.yandex.f6462l;
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            c14047l = new C14047l(c13220l, z, interfaceC14029l, 3);
            c7068l.f14813l = null;
            c7068l.f14812l = null;
            c7068l.f14815l = null;
            c7068l.f14809l = i2;
            c7068l.f14811l = 2;
            if (AbstractC10999l.firebase(c2975l, c14047l, c7068l) == enumC9342l) {
                return enumC9342l;
            }
            return Unit.INSTANCE;
            Catalog2Root catalog2Root = ((Catalog2Response) objAdmob).yandex;
            if (catalog2Root != null && (list = catalog2Root.loadAd) != null) {
                for (Catalog2Section catalog2Section : list) {
                    String str2 = catalog2Section.yandex;
                    c13220l2.getClass();
                    arrayList.add(new C15191l(str2, 5));
                    arrayList2.add(catalog2Section.loadAd);
                }
            }
            Iterator it = c13220l2.f26000l.iterator();
            while (it.hasNext()) {
                ((AbstractC2484l) it.next()).appmetrica();
            }
            c13220l2.f26000l = arrayList;
            c13220l2.f25998l = arrayList2;
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        if (C1171l.yandex(c18435l) != null) {
            c13220l.f26000l = c2580l;
            c13220l.f25998l = c2580l;
        }
        C16552l c16552l2 = AbstractC11463l.yandex;
        c2975l = AbstractC17278l.yandex.f6462l;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        c14047l = new C14047l(c13220l, z, interfaceC14029l, 3);
        c7068l.f14813l = null;
        c7068l.f14812l = null;
        c7068l.f14815l = null;
        c7068l.f14809l = i2;
        c7068l.f14811l = 2;
        if (AbstractC10999l.firebase(c2975l, c14047l, c7068l) == enumC9342l) {
            return enumC9342l;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    public final void appmetrica() {
        super.appmetrica();
        this.f25997l.getClass();
        this.f26002l.appmetrica();
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: case */
    public final AbstractC14412l mo647case() {
        final int i = 0;
        final int i2 = 1;
        return new C11446l(new Function0(this) { // from class: lْۛؗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13220l f26678l;

            {
                this.f26678l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                C13220l c13220l = this.f26678l;
                switch (i3) {
                    case 0:
                        AbstractC9029l.loadAd(c13220l.isVip());
                        break;
                    default:
                        C1008l c1008l = c13220l.f25999l;
                        c1008l.getClass();
                        c1008l.remoteconfig(null, "");
                        c13220l.f26001l.smaato("");
                        c13220l.f26002l.mo782this();
                        c13220l.m3621instanceof("", false);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new Function0(this) { // from class: lْۛؗ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C13220l f26678l;

            {
                this.f26678l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C13220l c13220l = this.f26678l;
                switch (i3) {
                    case 0:
                        AbstractC9029l.loadAd(c13220l.isVip());
                        break;
                    default:
                        C1008l c1008l = c13220l.f25999l;
                        c1008l.getClass();
                        c1008l.remoteconfig(null, "");
                        c13220l.f26001l.smaato("");
                        c13220l.f26002l.mo782this();
                        c13220l.m3621instanceof("", false);
                        break;
                }
                return Unit.INSTANCE;
            }
        }, new C12433l(this, 1), new C12433l(this, 2), false, false, null, 112);
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: import */
    public final void mo2199import(int i, float f) {
        this.f25997l.firebase(i, f);
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC17777l
    public final void inmobi() {
        super.inmobi();
        this.f26002l.inmobi();
    }

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    public final void m3621instanceof(String str, boolean z) {
        if (z) {
            AbstractC14412l abstractC14412l = this.f5279l;
            if (abstractC14412l == null) {
                abstractC14412l = null;
            }
            C11446l c11446l = (C11446l) abstractC14412l;
            c11446l.smaato.setValue(str);
            c11446l.remoteconfig(true);
        }
        C1008l c1008l = this.f26001l;
        c1008l.getClass();
        c1008l.remoteconfig(null, "");
        this.f25999l.smaato(str);
    }

    @Override // defpackage.InterfaceC0605l
    public final void mopub(String str) {
        m3621instanceof(str, false);
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: new */
    public final List mo2201new() {
        return this.f26000l;
    }

    @Override // defpackage.AbstractC17777l
    public final void premium() {
        AbstractC10999l.mopub(AbstractC11990l.firebase(this), null, 0, new C7174l(this, null, 1), 3);
    }

    @Override // defpackage.InterfaceC0605l
    public final void remoteconfig(int i, int i2, Intent intent) {
        AbstractC9029l.yandex(this, i, i2, intent);
    }

    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l, defpackage.AbstractC17777l
    /* JADX INFO: renamed from: strictfp */
    public final void mo1148strictfp() {
        super.mo1148strictfp();
        this.f25997l.getClass();
        this.f26002l.mo1148strictfp();
    }

    @Override // defpackage.AbstractC15680l, defpackage.InterfaceC0489l
    public final void subs() {
        AbstractC14412l abstractC14412l = this.f5279l;
        if (abstractC14412l == null) {
            abstractC14412l = null;
        }
        ((C11446l) abstractC14412l).isPro.setValue(Boolean.TRUE);
    }

    @Override // defpackage.AbstractC15680l
    /* JADX INFO: renamed from: super */
    public final List mo2202super() {
        return this.f25998l;
    }

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
    @Override // defpackage.AbstractC15680l, defpackage.AbstractC2484l
    /* JADX INFO: renamed from: switch */
    public final View mo1149switch(Context context, LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        View viewAmazon = this.f25997l.amazon(context, linearLayout);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        VKXApplication.Companion companion = VKXApplication.f36628l;
        layoutParams.topMargin = VKXApplication.Companion.yandex(8.0f);
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(viewAmazon, layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        C9967l c9967l = this.f34613l;
        C15288l c15288l = this.f26002l;
        c15288l.m4408native(c9967l);
        c15288l.premium();
        View viewApplovin = c15288l.applovin(frameLayout);
        c15288l.mo783volatile(viewApplovin);
        c15288l.mo2005throws();
        this.f25996l = viewApplovin;
        frameLayout.addView(viewApplovin, new FrameLayout.LayoutParams(-1, -1));
        View viewMo1149switch = super.mo1149switch(context, layoutInflater);
        this.f26003l = (C11560l) viewMo1149switch;
        frameLayout.addView(viewMo1149switch, new FrameLayout.LayoutParams(-1, -1));
        return linearLayout;
    }
}
