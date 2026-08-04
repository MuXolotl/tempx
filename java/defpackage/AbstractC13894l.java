package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lٓؓٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13894l {
    public static final List yandex = AbstractC14055l.remoteconfig("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz");

    public static final C8485l yandex(String str) {
        String string = AbstractC12024l.m3330l(str).toString();
        try {
            return AbstractC9831l.billing(string);
        } catch (C7998l unused) {
            String string2 = AbstractC12024l.m3330l(string).toString();
            Iterator it = yandex.iterator();
            while (it.hasNext()) {
                try {
                    return new C10828l((String) it.next()).purchase(string);
                } catch (C4773l unused2) {
                }
            }
            C17132l.metrica(string2, "Failed to parse date: ");
            return null;
        }
    }
}
