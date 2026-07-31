package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؐ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8464l extends AbstractC0290l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final View f17498l;

    /* JADX INFO: renamed from: lؙۛۨ, reason: contains not printable characters */
    public Function1 f17499l;

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C17110l f17500l;

    /* JADX INFO: renamed from: lْؕٙ, reason: contains not printable characters */
    public InterfaceC18327l f17501l;

    /* JADX INFO: renamed from: lٓٗۢ, reason: contains not printable characters */
    public Function1 f17502l;

    /* JADX INFO: renamed from: lْ٘ۗ, reason: contains not printable characters */
    public Function1 f17503l;

    public C8464l(Context context, Function1 function1, AbstractC0306l abstractC0306l, InterfaceC2449l interfaceC2449l, int i, InterfaceC11218l interfaceC11218l) {
        View view = (View) function1.invoke(context);
        C17110l c17110l = new C17110l();
        super(context, abstractC0306l, i, c17110l, view, interfaceC11218l);
        this.f17498l = view;
        this.f17500l = c17110l;
        setClipChildren(false);
        String strValueOf = String.valueOf(i);
        Object objPurchase = interfaceC2449l != null ? interfaceC2449l.purchase(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objPurchase instanceof SparseArray ? (SparseArray) objPurchase : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (interfaceC2449l != null) {
            setSavableRegistryEntry(interfaceC2449l.billing(strValueOf, new C7228l(this, 2)));
        }
        C11192l c11192l = C11192l.f22531l;
        this.f17503l = c11192l;
        this.f17499l = c11192l;
        this.f17502l = c11192l;
    }

    private final void setSavableRegistryEntry(InterfaceC18327l interfaceC18327l) {
        InterfaceC18327l interfaceC18327l2 = this.f17501l;
        if (interfaceC18327l2 != null) {
            ((C5991l) interfaceC18327l2).signatures();
        }
        this.f17501l = interfaceC18327l;
    }

    public static final void vip(C8464l c8464l) {
        c8464l.setSavableRegistryEntry(null);
    }

    public final C17110l getDispatcher() {
        return this.f17500l;
    }

    public final Function1<View, Unit> getReleaseBlock() {
        return this.f17502l;
    }

    public final Function1<View, Unit> getResetBlock() {
        return this.f17499l;
    }

    public /* bridge */ /* synthetic */ AbstractC15391l getSubCompositionView() {
        return null;
    }

    public final Function1<View, Unit> getUpdateBlock() {
        return this.f17503l;
    }

    public final void setReleaseBlock(Function1<View, Unit> function1) {
        this.f17502l = function1;
        setRelease(new C7228l(this, 3));
    }

    public final void setResetBlock(Function1<View, Unit> function1) {
        this.f17499l = function1;
        setReset(new C7228l(this, 4));
    }

    public final void setUpdateBlock(Function1<View, Unit> function1) {
        this.f17503l = function1;
        setUpdate(new C7228l(this, 5));
    }

    public View getViewRoot() {
        return this;
    }
}
