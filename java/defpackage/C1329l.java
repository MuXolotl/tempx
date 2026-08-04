package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lٖؒۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1329l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ String f3417l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f3418l;

    public /* synthetic */ C1329l(String str, int i) {
        this.f3418l = i;
        this.f3417l = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f3418l;
        String str = this.f3417l;
        switch (i) {
            case 0:
                return new C12772l(str, 16);
            case 1:
                return new C12772l(str, 8);
            case 2:
                StringBuilder sb = new StringBuilder("https://vk.com/audios");
                C16287l.yandex.getClass();
                sb.append(C16287l.crashlytics());
                sb.append("?section=");
                sb.append(str);
                return new C12772l(sb.toString(), 8);
            default:
                return new C12772l(str, 8);
        }
    }
}
