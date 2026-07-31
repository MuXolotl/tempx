package defpackage;

import java.util.Arrays;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: lٓۤۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14528l implements InterfaceC14046l {
    public final /* synthetic */ String loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C14528l(String str, int i) {
        this.yandex = i;
        this.loadAd = str;
    }

    @Override // defpackage.InterfaceC14046l
    public final void yandex(C12398l c12398l, Object obj, C6344l c6344l) throws C2584l {
        int i = this.yandex;
        String str = this.loadAd;
        switch (i) {
            case 0:
                ((InterfaceC17589l) obj).crashlytics(AbstractC17551l.admob(c12398l.loadAd, str));
                return;
            case 1:
                ((InterfaceC17589l) obj).loadAd(AbstractC17551l.admob(c12398l.loadAd, str));
                return;
            case 2:
                InterfaceC17589l interfaceC17589l = (InterfaceC17589l) obj;
                String[] strArrSplit = AbstractC17551l.subs(c12398l.loadAd, str).split(AbstractC6052l.yandex);
                if (strArrSplit.length > 0) {
                    interfaceC17589l.purchase(Arrays.asList(strArrSplit));
                    return;
                }
                return;
            case 3:
                InterfaceC17589l interfaceC17589l2 = (InterfaceC17589l) obj;
                Matcher matcher = AbstractC6052l.amazon.matcher(c12398l.loadAd);
                if (!matcher.matches()) {
                    throw new C2584l(17, str);
                }
                interfaceC17589l2.yandex(new C14179l(AbstractC17551l.admob(matcher.group(1), str), AbstractC17551l.admob(matcher.group(2), str)));
                return;
            case 4:
                InterfaceC17589l interfaceC17589l3 = (InterfaceC17589l) obj;
                String str2 = c12398l.loadAd;
                try {
                    interfaceC17589l3.amazon(Float.parseFloat(str2));
                    return;
                } catch (NumberFormatException unused) {
                    throw C2584l.yandex(str, 33, str2);
                }
            default:
                ((InterfaceC17589l) obj).billing(AbstractC17551l.subs(c12398l.loadAd, str));
                return;
        }
    }
}
