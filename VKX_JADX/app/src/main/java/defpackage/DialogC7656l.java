package defpackage;

import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lؚۦٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC7656l extends DialogC0427l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final View f15783l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C9295l f15784l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Function0 f15785l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public boolean f15786l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public C9401l f15787l;

    public DialogC7656l(Function0 function0, C9401l c9401l, View view, EnumC9931l enumC9931l, InterfaceC13490l interfaceC13490l, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.DialogWindowTheme), 0);
        this.f15785l = function0;
        this.f15787l = c9401l;
        this.f15783l = view;
        Window window = getWindow();
        if (window == null) {
            C8339l.smaato("Dialog has no window");
            throw null;
        }
        C9401l c9401l2 = this.f15787l;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            c9401l2.getClass();
            attributes.type = 2;
            window2.setAttributes(attributes);
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        this.f15787l.getClass();
        AbstractC2829l.yandex(window, true);
        window.setGravity(17);
        this.f15787l.getClass();
        C9295l c9295l = new C9295l(getContext(), window);
        this.f15787l.getClass();
        setTitle("");
        c9295l.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c9295l.setClipChildren(false);
        c9295l.setElevation(interfaceC13490l.mo868instanceof(8.0f));
        c9295l.setOutlineProvider(new C4096l(0));
        this.f15784l = c9295l;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            billing(viewGroup);
        }
        setContentView(c9295l);
        c9295l.setTag(R.id.view_tree_lifecycle_owner, AbstractC6889l.purchase(view));
        c9295l.setTag(R.id.view_tree_view_model_store_owner, AbstractC1135l.crashlytics(view));
        c9295l.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC17344l.loadAd(view));
        mopub(this.f15785l, this.f15787l, enumC9931l);
        yandex().yandex(new C4983l(new C16195l(this, i)), this);
    }

    public static final void billing(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C9295l) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                billing(viewGroup2);
            }
        }
    }

    public final void mopub(Function0 function0, C9401l c9401l, EnumC9931l enumC9931l) {
        int i;
        this.f15785l = function0;
        this.f15787l = c9401l;
        c9401l.getClass();
        boolean zLoadAd = AbstractC3017l.loadAd(this.f15783l);
        int iInmobi = AbstractC5020l.inmobi(1);
        if (iInmobi != 0) {
            if (iInmobi == 1) {
                zLoadAd = true;
            } else {
                if (iInmobi != 2) {
                    C18725l.billing();
                    return;
                }
                zLoadAd = false;
            }
        }
        getWindow().setFlags(zLoadAd ? 8192 : -8193, 8192);
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
        C9295l c9295l = this.f15784l;
        c9295l.setLayoutDirection(i);
        Window window = c9295l.f19096l;
        boolean z = (c9295l.f19100l && true == c9295l.f19098l && true == c9295l.f19095l) ? false : true;
        c9295l.f19098l = true;
        c9295l.f19095l = true;
        if (z && (-2 != window.getAttributes().width || !c9295l.f19100l)) {
            window.setLayout(-2, -2);
            c9295l.f19100l = true;
        }
        setCanceledOnTouchOutside(c9401l.loadAd);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(0);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f15787l.yandex || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f15785l.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iAds;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f15787l.loadAd) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.f15786l = false;
            return zOnTouchEvent;
        }
        C9295l c9295l = this.f15784l;
        c9295l.getClass();
        if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = c9295l.getChildAt(0)) != null) {
            int left = childAt.getLeft() + c9295l.getLeft();
            int width = childAt.getWidth() + left;
            int top = childAt.getTop() + c9295l.getTop();
            int height = childAt.getHeight() + top;
            int iAds2 = AbstractC5573l.ads(motionEvent.getX());
            if (left <= iAds2 && iAds2 <= width && top <= (iAds = AbstractC5573l.ads(motionEvent.getY())) && iAds <= height) {
                actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                    this.f15786l = false;
                    return zOnTouchEvent;
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.f15786l = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.f15786l = false;
                return zOnTouchEvent;
            }
        } else if (this.f15786l) {
            this.f15785l.invoke();
            this.f15786l = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
