package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؙؗؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4624l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7883l f9397l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9398l;

    public /* synthetic */ C4624l(C7883l c7883l, int i) {
        this.f9398l = i;
        this.f9397l = c7883l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f9398l;
        C7883l c7883l = this.f9397l;
        switch (i) {
            case 0:
                c7883l.f16446l.setValue(Boolean.FALSE);
                break;
            case 1:
                InterfaceC7064l interfaceC7064l = (InterfaceC7064l) c7883l.f16438l.getValue();
                if (interfaceC7064l instanceof C12407l) {
                    C8183l.yandex.loadAd(((C12407l) interfaceC7064l).yandex);
                    c7883l.purchase();
                } else {
                    c7883l.f16446l.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                c7883l.purchase();
                break;
            case 3:
                c7883l.f5081l.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(AbstractC0653l.ads(new StringBuilder("https://id."), AbstractC9549l.purchase, "/about/faq/users/registration_and_login/login/QR/20314"))));
                break;
            case 4:
                c7883l.f16446l.setValue(Boolean.FALSE);
                break;
            case 5:
                c7883l.purchase();
                break;
            default:
                c7883l.m2211package(EnumC3909l.f8051l);
                c7883l.m2212synchronized(C12595l.yandex);
                break;
        }
        return Unit.INSTANCE;
    }
}
