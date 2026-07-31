package defpackage;

import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lَۛۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10575l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7679l f21487l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21488l;

    public /* synthetic */ C10575l(C7679l c7679l, int i) {
        this.f21488l = i;
        this.f21487l = c7679l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f21488l;
        C7679l c7679l = this.f21487l;
        switch (i) {
            case 0:
                new C8884l(c7679l.m2196instanceof(), (EnumC8514l) c7679l.f16105l.getValue()).Signature(c7679l.isVip());
                break;
            case 1:
                c7679l.m4125private(new C14089l());
                break;
            case 2:
                c7679l.m4125private(new C8802l(0));
                break;
            case 3:
                AbstractC10999l.mopub(AbstractC11990l.firebase(c7679l), null, 0, new C6658l(c7679l, (InterfaceC14029l) null, 7), 3);
                break;
            default:
                c7679l.isVip().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vkx.app/license")));
                break;
        }
        return Unit.INSTANCE;
    }
}
