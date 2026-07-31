package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;

/* JADX INFO: renamed from: lؚّ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12899l implements InterfaceC7744l, InterfaceC16004l, InterfaceC15446l, InterfaceC11989l, InterfaceC4701l, InterfaceC8112l, InterfaceC9765l, InterfaceC7359l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f25363l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25356l = new C12899l(15);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25353l = new C12899l(16);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25359l = new C12899l(17);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25358l = new C12899l(18);

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25361l = new C12899l(19);

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25354l = new C12899l(20);

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25355l = new C12899l(21);

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25360l = new C12899l(22);

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25357l = new C12899l(23);

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public static final /* synthetic */ C12899l f25362l = new C12899l(24);

    public C12899l(InterfaceC1218l interfaceC1218l, int i) {
        this.f25363l = 14;
    }

    public static boolean yandex(C6093l c6093l, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z2) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z2) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z2 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i2, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z3) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z3) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z3 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                C2085l[] c2085lArr = (C2085l[]) editable.getSpans(selectionStart, iMin, C2085l.class);
                if (c2085lArr != null && c2085lArr.length > 0) {
                    for (C2085l c2085l : c2085lArr) {
                        int spanStart = editable.getSpanStart(c2085l);
                        int spanEnd = editable.getSpanEnd(c2085l);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c6093l.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c6093l.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4701l
    public long admob() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.InterfaceC7744l
    public boolean ads(C10814l c10814l) {
        return false;
    }

    @Override // defpackage.InterfaceC8112l
    /* JADX INFO: renamed from: implements */
    public /* synthetic */ String mo2259implements(String str, String str2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0266  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f  */
    /* JADX WARN: Code duplicated, block: B:279:0x040f  */
    /* JADX WARN: Code duplicated, block: B:282:0x041a  */
    /* JADX WARN: Code duplicated, block: B:285:0x0425  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:84:0x012c  */
    public EnumC14173l loadAd(KeyEvent keyEvent) {
        EnumC14173l enumC14173l;
        EnumC14173l enumC14173l2;
        EnumC14173l enumC14173l3;
        int iAdmob = AbstractC15576l.admob(keyEvent);
        EnumC14173l enumC14173l4 = null;
        if (iAdmob == 9) {
            long jYandex = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex, AbstractC5072l.billing)) {
                enumC14173l = EnumC14173l.SELECT_LINE_LEFT;
            } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.mopub)) {
                enumC14173l = EnumC14173l.SELECT_LINE_RIGHT;
            } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.amazon)) {
                enumC14173l = EnumC14173l.SELECT_HOME;
            } else if (AbstractC5072l.yandex(jYandex, AbstractC5072l.purchase)) {
                enumC14173l = EnumC14173l.SELECT_END;
            } else {
                enumC14173l = null;
            }
        } else if (iAdmob == 1) {
            long jYandex2 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex2, AbstractC5072l.billing)) {
                enumC14173l = EnumC14173l.LINE_LEFT;
            } else if (AbstractC5072l.yandex(jYandex2, AbstractC5072l.mopub)) {
                enumC14173l = EnumC14173l.LINE_RIGHT;
            } else if (AbstractC5072l.yandex(jYandex2, AbstractC5072l.amazon)) {
                enumC14173l = EnumC14173l.HOME;
            } else if (AbstractC5072l.yandex(jYandex2, AbstractC5072l.purchase)) {
                enumC14173l = EnumC14173l.END;
            } else if (AbstractC5072l.yandex(jYandex2, AbstractC5072l.subscription)) {
                enumC14173l = EnumC14173l.DELETE_FROM_LINE_START;
            } else {
                enumC14173l = null;
            }
        } else {
            enumC14173l = null;
        }
        if (enumC14173l != null) {
            return enumC14173l;
        }
        int iAdmob2 = AbstractC15576l.admob(keyEvent);
        long jYandex3 = AbstractC0593l.yandex(keyEvent.getKeyCode());
        boolean zYandex = AbstractC5072l.yandex(jYandex3, AbstractC5072l.subscription);
        EnumC14173l enumC14173l5 = EnumC14173l.NEW_LINE;
        EnumC14173l enumC14173l6 = EnumC14173l.DELETE_PREV_CHAR;
        if (zYandex) {
            if (iAdmob2 == 0 || iAdmob2 == 8 || iAdmob2 == 12) {
                enumC14173l2 = enumC14173l6;
            } else if (iAdmob2 == 2 || iAdmob2 == 10) {
                enumC14173l2 = EnumC14173l.DELETE_PREV_WORD;
            } else {
                enumC14173l2 = null;
            }
        } else if ((AbstractC5072l.yandex(jYandex3, AbstractC5072l.ads) || AbstractC5072l.yandex(jYandex3, AbstractC5072l.inmobi)) && (iAdmob2 == 0 || iAdmob2 == 8 || iAdmob2 == 2 || iAdmob2 == 10)) {
            enumC14173l2 = enumC14173l5;
        } else {
            enumC14173l2 = null;
        }
        if (enumC14173l2 != null) {
            return enumC14173l2;
        }
        int iAdmob3 = AbstractC15576l.admob(keyEvent);
        EnumC14173l enumC14173l7 = EnumC14173l.SELECT_LINE_START;
        EnumC14173l enumC14173l8 = EnumC14173l.SELECT_LINE_END;
        if (iAdmob3 == 10) {
            long jYandex4 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex4, AbstractC5072l.billing) || AbstractC5072l.yandex(jYandex4, AbstractC5072l.f11080synchronized)) {
                enumC14173l3 = EnumC14173l.SELECT_LEFT_WORD;
            } else if (AbstractC5072l.yandex(jYandex4, AbstractC5072l.mopub) || AbstractC5072l.yandex(jYandex4, AbstractC5072l.f11079strictfp)) {
                enumC14173l3 = EnumC14173l.SELECT_RIGHT_WORD;
            } else if (AbstractC5072l.yandex(jYandex4, AbstractC5072l.amazon) || AbstractC5072l.yandex(jYandex4, AbstractC5072l.f11082throws)) {
                enumC14173l3 = EnumC14173l.SELECT_PREV_PARAGRAPH;
            } else if (AbstractC5072l.yandex(jYandex4, AbstractC5072l.purchase) || AbstractC5072l.yandex(jYandex4, AbstractC5072l.f11077package)) {
                enumC14173l3 = EnumC14173l.SELECT_NEXT_PARAGRAPH;
            } else {
                enumC14173l3 = null;
            }
        } else if (iAdmob3 == 2) {
            long jYandex5 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.billing) || AbstractC5072l.yandex(jYandex5, AbstractC5072l.f11080synchronized)) {
                enumC14173l3 = EnumC14173l.LEFT_WORD;
            } else if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.mopub) || AbstractC5072l.yandex(jYandex5, AbstractC5072l.f11079strictfp)) {
                enumC14173l3 = EnumC14173l.RIGHT_WORD;
            } else if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.amazon) || AbstractC5072l.yandex(jYandex5, AbstractC5072l.f11082throws)) {
                enumC14173l3 = EnumC14173l.PREV_PARAGRAPH;
            } else if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.purchase) || AbstractC5072l.yandex(jYandex5, AbstractC5072l.f11077package)) {
                enumC14173l3 = EnumC14173l.NEXT_PARAGRAPH;
            } else if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.firebase)) {
                enumC14173l3 = enumC14173l6;
            } else if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.tapsense)) {
                enumC14173l3 = EnumC14173l.DELETE_NEXT_WORD;
            } else if (AbstractC5072l.yandex(jYandex5, AbstractC5072l.premium)) {
                enumC14173l3 = EnumC14173l.DESELECT;
            } else {
                enumC14173l3 = null;
            }
        } else if (iAdmob3 == 8) {
            long jYandex6 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex6, AbstractC5072l.license) || AbstractC5072l.yandex(jYandex6, AbstractC5072l.f11083volatile)) {
                enumC14173l3 = enumC14173l7;
            } else if (AbstractC5072l.yandex(jYandex6, AbstractC5072l.pro) || AbstractC5072l.yandex(jYandex6, AbstractC5072l.f11076native)) {
                enumC14173l3 = enumC14173l8;
            } else {
                enumC14173l3 = null;
            }
        } else if (iAdmob3 == 1 && AbstractC5072l.yandex(AbstractC0593l.yandex(keyEvent.getKeyCode()), AbstractC5072l.tapsense)) {
            enumC14173l3 = EnumC14173l.DELETE_TO_LINE_END;
        } else {
            enumC14173l3 = null;
        }
        if (enumC14173l3 != null) {
            return enumC14173l3;
        }
        Object obj = AbstractC6615l.yandex.f4179l;
        int iAdmob4 = AbstractC15576l.admob(keyEvent);
        if (iAdmob4 == 10) {
            if (AbstractC5072l.yandex(AbstractC0593l.yandex(keyEvent.getKeyCode()), AbstractC5072l.metrica)) {
                enumC14173l4 = EnumC14173l.REDO;
            }
        } else if (iAdmob4 == 2) {
            long jYandex7 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex7, AbstractC5072l.isPro) || AbstractC5072l.yandex(jYandex7, AbstractC5072l.ad) || AbstractC5072l.yandex(jYandex7, AbstractC5072l.f11075for)) {
                enumC14173l4 = EnumC14173l.COPY;
            } else if (AbstractC5072l.yandex(jYandex7, AbstractC5072l.smaato)) {
                enumC14173l4 = EnumC14173l.PASTE;
            } else if (AbstractC5072l.yandex(jYandex7, AbstractC5072l.remoteconfig)) {
                enumC14173l4 = EnumC14173l.CUT;
            } else if (AbstractC5072l.yandex(jYandex7, AbstractC5072l.subs)) {
                enumC14173l4 = EnumC14173l.SELECT_ALL;
            } else if (AbstractC5072l.yandex(jYandex7, AbstractC5072l.vip)) {
                enumC14173l4 = EnumC14173l.REDO;
            } else if (AbstractC5072l.yandex(jYandex7, AbstractC5072l.metrica)) {
                enumC14173l4 = EnumC14173l.UNDO;
            }
        } else if (iAdmob4 == 8) {
            long jYandex8 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.billing) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11080synchronized)) {
                enumC14173l4 = EnumC14173l.SELECT_LEFT_CHAR;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.mopub) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11079strictfp)) {
                enumC14173l4 = EnumC14173l.SELECT_RIGHT_CHAR;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.amazon) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11082throws)) {
                enumC14173l4 = EnumC14173l.SELECT_UP;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.purchase) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11077package)) {
                enumC14173l4 = EnumC14173l.SELECT_DOWN;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.applovin) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11078private)) {
                enumC14173l4 = EnumC14173l.SELECT_PAGE_UP;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.appmetrica) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11074extends)) {
                enumC14173l4 = EnumC14173l.SELECT_PAGE_DOWN;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.license) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11083volatile)) {
                enumC14173l4 = enumC14173l7;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.pro) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11076native)) {
                enumC14173l4 = enumC14173l8;
            } else if (AbstractC5072l.yandex(jYandex8, AbstractC5072l.ad) || AbstractC5072l.yandex(jYandex8, AbstractC5072l.f11075for)) {
                enumC14173l4 = EnumC14173l.PASTE;
            }
        } else if (iAdmob4 == 0) {
            long jYandex9 = AbstractC0593l.yandex(keyEvent.getKeyCode());
            if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.billing) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11080synchronized)) {
                enumC14173l4 = EnumC14173l.LEFT_CHAR;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.mopub) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11079strictfp)) {
                enumC14173l4 = EnumC14173l.RIGHT_CHAR;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.amazon) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11082throws)) {
                enumC14173l4 = EnumC14173l.UP;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.purchase) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11077package)) {
                enumC14173l4 = EnumC14173l.DOWN;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.admob)) {
                enumC14173l4 = EnumC14173l.CENTER;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.applovin) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11078private)) {
                enumC14173l4 = EnumC14173l.PAGE_UP;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.appmetrica) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11074extends)) {
                enumC14173l4 = EnumC14173l.PAGE_DOWN;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.license) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11083volatile)) {
                enumC14173l4 = EnumC14173l.LINE_START;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.pro) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.f11076native)) {
                enumC14173l4 = EnumC14173l.LINE_END;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.ads) || AbstractC5072l.yandex(jYandex9, AbstractC5072l.inmobi)) {
                enumC14173l4 = enumC14173l5;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.subscription)) {
                enumC14173l4 = enumC14173l6;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.tapsense)) {
                enumC14173l4 = EnumC14173l.DELETE_NEXT_CHAR;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.signatures)) {
                enumC14173l4 = EnumC14173l.PASTE;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.advert)) {
                enumC14173l4 = EnumC14173l.CUT;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.isVip)) {
                enumC14173l4 = EnumC14173l.COPY;
            } else if (AbstractC5072l.yandex(jYandex9, AbstractC5072l.startapp)) {
                enumC14173l4 = EnumC14173l.TAB;
            }
        }
        return enumC14173l4;
    }

    public String toString() {
        switch (this.f25363l) {
            case 9:
                int iHashCode = hashCode();
                AbstractC8576l.loadAd(16);
                return AbstractC14814l.ads("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", AbstractC18202l.yandex.loadAd(Bundle.class).license(), ">");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9765l
    public Object zza() {
        switch (this.f25363l) {
            case 16:
                List list = AbstractC5981l.yandex;
                return (String) C12384l.loadAd.get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list2 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(1800000L, 41, "measurement.sgtm.batch.retry_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Long) C4515l.yandex.billing(500L, 28, "measurement.upload.minimum_delay").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list4 = AbstractC5981l.yandex;
                C12737l.f25103l.get();
                return (Boolean) C1801l.yandex.yandex("measurement.test.boolean_flag", false, 0).get();
            case 20:
                List list5 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return Integer.valueOf((int) ((Long) C4515l.yandex.billing(1L, 18, "measurement.dma_consent.max_daily_dcu_realtime_events").get()).longValue());
            case 21:
                List list6 = AbstractC5981l.yandex;
                C16872l.f32926l.get();
                return (Boolean) C4515l.yandex.yandex("measurement.config.bundle_for_all_apps_on_backgrounded", true, 2).get();
            case 22:
                List list7 = AbstractC5981l.yandex;
                return Integer.valueOf((int) ((Long) C10808l.yandex.get()).longValue());
            case 23:
                List list8 = AbstractC5981l.yandex;
                return (Boolean) C16132l.yandex.get();
            default:
                throw new IllegalStateException();
        }
    }

    public /* synthetic */ C12899l(int i) {
        this.f25363l = i;
    }

    @Override // defpackage.InterfaceC16004l
    /* JADX INFO: renamed from: apply */
    public Object mo1368apply(Object obj) {
        return obj;
    }
}
