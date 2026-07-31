package defpackage;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍُٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11025l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ int f22215l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C1930l f22216l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11025l(C1930l c1930l, InterfaceC14029l interfaceC14029l, int i) {
        super(2, interfaceC14029l);
        this.f22215l = i;
        this.f22216l = c1930l;
    }

    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        int i = this.f22215l;
        C1930l c1930l = this.f22216l;
        switch (i) {
            case 0:
                AbstractC2829l.crashlytics(obj);
                c1930l.purchase();
                AbstractC11708l.yandex(new C15245l(0, c1930l.f5081l, "Аудиозапись загружена на сервер!"));
                break;
            default:
                AbstractC2829l.crashlytics(obj);
                int i2 = C1930l.f4394l;
                c1930l.f4398l.setValue(Boolean.TRUE);
                C10086l c10086l = c1930l.f4396l;
                Bitmap bitmap = (Bitmap) c10086l.getValue();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                c10086l.setValue(null);
                c1930l.f4400l.setValue(null);
                c1930l.f4399l.setValue("Untitled");
                c1930l.f4397l.setValue("Unknown artist");
                break;
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        int i = this.f22215l;
        C1930l c1930l = this.f22216l;
        switch (i) {
            case 0:
                return new C11025l(c1930l, interfaceC14029l, 0);
            default:
                return new C11025l(c1930l, interfaceC14029l, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) obj;
        InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj2;
        switch (this.f22215l) {
            case 0:
                break;
        }
        return ((C11025l) ads(interfaceC14029l, interfaceC2262l)).Signature(Unit.INSTANCE);
    }
}
