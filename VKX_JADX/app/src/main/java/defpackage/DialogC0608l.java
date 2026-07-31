package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؑۜۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0608l extends DialogC0427l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f2058l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final View f2059l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function0 f2060l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C2999l f2061l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C15721l f2062l;

    public DialogC0608l(Function0 function0, C15721l c15721l, long j, View view, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f2060l = function0;
        this.f2062l = c15721l;
        this.f2058l = j;
        this.f2059l = view;
        Window window = getWindow();
        if (window == null) {
            C8339l.smaato("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC2829l.yandex(window, false);
        C2999l c2999l = new C2999l(getContext());
        c2999l.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c2999l.setClipChildren(false);
        c2999l.setElevation(interfaceC13490l.mo868instanceof(8.0f));
        c2999l.setOutlineProvider(new C4096l(1));
        this.f2061l = c2999l;
        setContentView(c2999l);
        c2999l.setTag(R.id.view_tree_lifecycle_owner, AbstractC6889l.purchase(view));
        c2999l.setTag(R.id.view_tree_view_model_store_owner, AbstractC1135l.crashlytics(view));
        c2999l.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC17344l.loadAd(view));
        billing(this.f2060l, this.f2062l, this.f2058l, enumC9931l);
    }

    public final void billing(Function0 function0, C15721l c15721l, long j, EnumC9931l enumC9931l) {
        int i;
        AbstractC0593l c6736l;
        this.f2060l = function0;
        this.f2062l = c15721l;
        this.f2058l = j;
        c15721l.getClass();
        ViewGroup.LayoutParams layoutParams = this.f2059l.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iInmobi = AbstractC5020l.inmobi(1);
        if (iInmobi != 0) {
            if (iInmobi == 1) {
                z = true;
            } else {
                if (iInmobi != 2) {
                    C18725l.billing();
                    return;
                }
                z = false;
            }
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        int iOrdinal = enumC9931l.ordinal();
        if (iOrdinal == 0) {
            i = 0;
        } else {
            if (iOrdinal != 1) {
                C18725l.billing();
                return;
            }
            i = 1;
        }
        this.f2061l.setLayoutDirection(i);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        Window window3 = getWindow();
        C1770l c1770l = new C1770l(getWindow().getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            c6736l = new C1492l(window3, c1770l);
        } else if (i2 >= 30) {
            c6736l = new C10196l(window3, c1770l);
        } else {
            c6736l = i2 >= 26 ? new C6736l(window3, c1770l) : new C16280l(window3, c1770l);
        }
        long j2 = C9735l.isPro;
        c6736l.purchase(!C9735l.crashlytics(j, j2) && ((double) AbstractC12953l.vip(j)) <= 0.5d);
        c6736l.amazon(!C9735l.crashlytics(j, j2) && ((double) AbstractC12953l.vip(j)) <= 0.5d);
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f2060l.invoke();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
