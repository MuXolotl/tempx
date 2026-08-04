package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: renamed from: lٍٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9625l extends AbstractRunnableC17845l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f19615l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Object f19616l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f19617l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f19618l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9625l(C14692l c14692l, Activity activity, BinderC1079l binderC1079l) {
        super((C9471l) c14692l.f28756l, true);
        this.f19617l = 3;
        this.f19615l = activity;
        this.f19616l = binderC1079l;
        this.f19618l = c14692l;
    }

    @Override // defpackage.AbstractRunnableC17845l
    public void loadAd() {
        switch (this.f19617l) {
            case 1:
                ((BinderC1079l) this.f19616l).mo785return(null);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.AbstractRunnableC17845l
    public final void yandex() {
        Boolean boolValueOf;
        Bundle bundle = null;
        InterfaceC0591l interfaceC0591lAsInterface = null;
        switch (this.f19617l) {
            case 0:
                try {
                    Context context = (Context) this.f19615l;
                    AbstractC1051l.subs(context);
                    String strMopub = AbstractC3739l.mopub(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(strMopub)) {
                        strMopub = AbstractC3739l.mopub(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strMopub);
                    if (identifier == 0) {
                        boolValueOf = null;
                    } else {
                        try {
                            boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                            boolValueOf = null;
                        }
                    }
                    C9471l c9471l = (C9471l) this.f19618l;
                    byte b = boolValueOf == null || !boolValueOf.booleanValue();
                    c9471l.getClass();
                    try {
                        interfaceC0591lAsInterface = AbstractBinderC10152l.asInterface(C7269l.crashlytics(context, b != false ? C7269l.amazon : C7269l.crashlytics, ModuleDescriptor.MODULE_ID).loadAd("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (C2315l e) {
                        c9471l.loadAd(e, true, false);
                    }
                    c9471l.billing = interfaceC0591lAsInterface;
                    if (c9471l.billing != null) {
                        int iYandex = C7269l.yandex(context, ModuleDescriptor.MODULE_ID);
                        int iAmazon = C7269l.amazon(context, ModuleDescriptor.MODULE_ID, false);
                        int iMax = Math.max(iYandex, iAmazon);
                        boolean z = Boolean.TRUE.equals(boolValueOf) || iAmazon < iYandex;
                        long j = iMax;
                        c9471l.mopub = j;
                        C16351l c16351l = new C16351l(161000L, j, z, (Bundle) this.f19616l, AbstractC3739l.mopub(context));
                        byte b2 = c9471l.mopub >= 169;
                        InterfaceC0591l interfaceC0591l = c9471l.billing;
                        if (b2 != true) {
                            AbstractC1051l.subs(interfaceC0591l);
                            interfaceC0591l.initialize(new BinderC14844l(context), c16351l, this.f34775l);
                        } else {
                            AbstractC1051l.subs(interfaceC0591l);
                            interfaceC0591l.initializeWithElapsedTime(new BinderC14844l(context), c16351l, this.f34775l, this.f34774l);
                        }
                    } else {
                        Log.w("FA", "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((C9471l) this.f19618l).loadAd(e2, true, false);
                    return;
                }
                break;
            case 1:
                InterfaceC0591l interfaceC0591l2 = ((C9471l) this.f19618l).billing;
                AbstractC1051l.subs(interfaceC0591l2);
                interfaceC0591l2.getMaxUserProperties((String) this.f19615l, (BinderC1079l) this.f19616l);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.f19616l;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                }
                InterfaceC0591l interfaceC0591l3 = ((C9471l) ((C14692l) this.f19618l).f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l3);
                interfaceC0591l3.onActivityCreatedByScionActivityInfo(C8066l.billing((Activity) this.f19615l), bundle, this.f34774l);
                break;
            default:
                InterfaceC0591l interfaceC0591l4 = ((C9471l) ((C14692l) this.f19618l).f28756l).billing;
                AbstractC1051l.subs(interfaceC0591l4);
                interfaceC0591l4.onActivitySaveInstanceStateByScionActivityInfo(C8066l.billing((Activity) this.f19615l), (BinderC1079l) this.f19616l, this.f34774l);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9625l(C9471l c9471l, Object obj, Object obj2, int i) {
        super(c9471l, true);
        this.f19617l = i;
        this.f19615l = obj;
        this.f19616l = obj2;
        this.f19618l = c9471l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9625l(C14692l c14692l, Bundle bundle, Activity activity) {
        super((C9471l) c14692l.f28756l, true);
        this.f19617l = 2;
        this.f19616l = bundle;
        this.f19615l = activity;
        this.f19618l = c14692l;
    }
}
