package defpackage;

/* JADX INFO: renamed from: lًٚؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8089l extends C17072l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final String f16868l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ int f16869l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8089l(AbstractC10022l abstractC10022l, String str, int i) {
        super(abstractC10022l, str);
        this.f16869l = i;
        switch (i) {
            case 1:
                super(abstractC10022l, str);
                StringBuilder sb = new StringBuilder("Unhandled redirect: ");
                InterfaceC1814l interfaceC1814l = abstractC10022l.loadAd().f27846l;
                sb.append((interfaceC1814l == null ? null : interfaceC1814l).getMethod().yandex);
                sb.append(' ');
                InterfaceC1814l interfaceC1814l2 = abstractC10022l.loadAd().f27846l;
                sb.append((interfaceC1814l2 != null ? interfaceC1814l2 : null).getUrl());
                sb.append(". Status: ");
                sb.append(abstractC10022l.mopub());
                sb.append(". Text: \"");
                this.f16868l = AbstractC2812l.tapsense(sb, str, '\"');
                break;
            case 2:
                super(abstractC10022l, str);
                StringBuilder sb2 = new StringBuilder("Server error(");
                InterfaceC1814l interfaceC1814l3 = abstractC10022l.loadAd().f27846l;
                sb2.append((interfaceC1814l3 == null ? null : interfaceC1814l3).getMethod().yandex);
                sb2.append(' ');
                InterfaceC1814l interfaceC1814l4 = abstractC10022l.loadAd().f27846l;
                sb2.append((interfaceC1814l4 != null ? interfaceC1814l4 : null).getUrl());
                sb2.append(": ");
                sb2.append(abstractC10022l.mopub());
                sb2.append(". Text: \"");
                this.f16868l = AbstractC2812l.tapsense(sb2, str, '\"');
                break;
            default:
                StringBuilder sb3 = new StringBuilder("Client request(");
                InterfaceC1814l interfaceC1814l5 = abstractC10022l.loadAd().f27846l;
                sb3.append((interfaceC1814l5 == null ? null : interfaceC1814l5).getMethod().yandex);
                sb3.append(' ');
                InterfaceC1814l interfaceC1814l6 = abstractC10022l.loadAd().f27846l;
                sb3.append((interfaceC1814l6 != null ? interfaceC1814l6 : null).getUrl());
                sb3.append(") invalid: ");
                sb3.append(abstractC10022l.mopub());
                sb3.append(". Text: \"");
                this.f16868l = AbstractC2812l.tapsense(sb3, str, '\"');
                break;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.f16869l) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f16868l;
    }
}
