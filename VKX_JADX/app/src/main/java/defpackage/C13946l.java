package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٓؖۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13946l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f27241l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Drawable f27242l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Function0 f27243l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13946l(Drawable drawable, Function0 function0, Function0 function1, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f27242l = drawable;
        this.f27243l = function0;
        this.f27241l = function1;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        AbstractC2829l.crashlytics(obj);
        ((AnimatedImageDrawable) this.f27242l).registerAnimationCallback(new C18399l(this.f27243l, this.f27241l));
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        return new C13946l(this.f27242l, this.f27243l, this.f27241l, interfaceC14029l);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C13946l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
