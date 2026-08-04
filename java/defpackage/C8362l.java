package defpackage;

import java.security.MessageDigest;
import java.security.Signature;
import javax.crypto.Mac;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lًۣٜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8362l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final String f17312l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17313l;

    public /* synthetic */ C8362l(String str, int i) {
        this.f17313l = i;
        this.f17312l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        int i = this.f17313l;
        String str2 = this.f17312l;
        switch (i) {
            case 0:
                return Mac.getInstance(str2);
            case 1:
                return MessageDigest.getInstance(str2);
            case 2:
                return Signature.getInstance(str2);
            case 3:
                return str2;
            case 4:
                String strTapsense = AbstractC2812l.tapsense(new StringBuilder(), AbstractC3974l.remoteconfig.yandex.yandex, '.');
                str = AbstractC16648l.isVip(str2, strTapsense, false) ? strTapsense : null;
                return str == null ? "" : str;
            default:
                String strTapsense2 = AbstractC2812l.tapsense(new StringBuilder(), AbstractC3974l.firebase.yandex.yandex, '.');
                str = AbstractC16648l.isVip(str2, strTapsense2, false) ? strTapsense2 : null;
                return str == null ? "" : str;
        }
    }
}
