package defpackage;

import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؗٚۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4990l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ C17120l f10225l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ float f10226l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4990l(C17120l c17120l, float f, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f10225l = c17120l;
        this.f10226l = f;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        C17120l c17120l = this.f10225l;
        Allocation allocation = (Allocation) c17120l.billing;
        ScriptIntrinsicBlur scriptIntrinsicBlur = (ScriptIntrinsicBlur) c17120l.amazon;
        if (!c17120l.loadAd) {
            float f = this.f10226l;
            if (f > 25.0f) {
                f = 25.0f;
            }
            scriptIntrinsicBlur.setRadius(f);
            scriptIntrinsicBlur.forEach(allocation);
            if (!c17120l.loadAd) {
                allocation.copyTo((Bitmap) c17120l.mopub);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C4990l(this.f10225l, this.f10226l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4990l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
