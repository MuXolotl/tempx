package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: lٌؙۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6352l implements Handler.Callback {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f13315l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13316l;

    public /* synthetic */ C6352l(int i, Object obj) {
        this.f13316l = i;
        this.f13315l = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.f13316l;
        Object obj = this.f13315l;
        switch (i) {
            case 0:
                C8961l c8961l = (C8961l) obj;
                InterfaceC8671l interfaceC8671l = (InterfaceC8671l) c8961l.purchase;
                interfaceC8671l.getClass();
                for (C18048l c18048l : (CopyOnWriteArraySet) c8961l.billing) {
                    if (!c18048l.amazon && c18048l.crashlytics) {
                        C4094l c4094lPurchase = c18048l.loadAd.purchase();
                        c18048l.loadAd = new C6921l(5);
                        c18048l.crashlytics = false;
                        interfaceC8671l.smaato(c18048l.yandex, c4094lPurchase);
                    }
                    C14500l c14500l = (C14500l) c8961l.amazon;
                    c14500l.getClass();
                    if (c14500l.yandex.hasMessages(1)) {
                        return true;
                    }
                }
                return true;
            case 1:
                C13568l c13568l = (C13568l) obj;
                if (message.what == 1) {
                    c13568l.vip();
                }
                return true;
            case 2:
                C17977l c17977l = (C17977l) obj;
                if (message.what == 1) {
                    C0188l c0188l = c17977l.purchase;
                    c0188l.m345l(false, c0188l.vip);
                }
                return true;
            default:
                C18289l c18289l = (C18289l) obj;
                int i2 = message.what;
                if (i2 == 1) {
                    ((C4440l) c18289l.admob).yandex();
                } else if (i2 == 2) {
                    ((C8078l) c18289l.subs).yandex();
                } else if (i2 == 3) {
                    ((C16459l) c18289l.isPro).yandex();
                } else {
                    if (i2 != 4) {
                        return false;
                    }
                    ((C6308l) c18289l.firebase).yandex();
                }
                return true;
        }
    }
}
